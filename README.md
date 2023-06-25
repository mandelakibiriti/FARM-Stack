## Backend
Create virtual environment and install dependencies from requirements.txt
```bash
$ pipenv shell
$ pipenv install -r requirements.txt
```

Directory structure
```bash
/App (base directory)
    |──backend (Has the backend functionality)
        ├── __init__.py
        ├── main.py
        ├──Server
            ├── app.py
            ├── database.py
            ├── models
            └── routers
                |── api.py
                └── db.py
    |── frontend (Has the frontend functionality)
```

Since we shall be using a React frontend [CORS will be required](https://fastapi.tiangolo.com/tutorial/cors/?h=cors) when a frontend running in a browser has JavaScript code communicates with a backend, and the backend is in a different "origin" than the frontend.
```python
origins = [
    "http://localhost.tiangolo.com",
    "https://localhost.tiangolo.com",
    "http://localhost",
    "http://localhost:8080",
]

app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)
```
Install Mongo Database on Ubuntu[https://www.mongodb.com/docs/v6.0/tutorial/install-mongodb-on-ubuntu/]

Create and connect the Mongo Database using the [motor driver](https://www.mongodb.com/docs/drivers/motor/) with a specific URL that will connect and create the database and collections associated with your models.py 

Since [Database authentication](https://www.mongodb.com/features/mongodb-authentication) is required you can create the authentication as part of the database using the admin name using `mongosh` in the terminal as shown below.

- Connect to the database
```bash
$ mongosh "mongodb://localhost:27017"
```
- Create a user account and role after connecting to the localhost instance of MongoDb
```bash
> USE test - or name of the user you want
test > db.createUser({user: "admin", pwd: "password%40mymongo", roles: [{role: "userAdminAnyDatabase", db:"admin"}]})
{ ok: 1 }
test > show users;
[
  {
    _id: 'test.admin',
    userId: new UUID("87a9b5f1-c2d1-417a-8309-a32d564613db"),
    user: 'admin',
    db: 'test',
    roles: [ { role: 'userAdminAnyDatabase', db: 'admin' } ],
    mechanisms: [ 'SCRAM-SHA-1', 'SCRAM-SHA-256' ]
  }
]
```
Confirm roles of the `test` as type admin user with `show roles;` command. You can also confirm creation of the user in `mongosh`:
```bash
db.getUsers({showCredentials: true})
```

- Add url to the FastAPI .env file to indicate the new user added:
```
> mongodb://admin:password%2540mymongo@localhost:27017/?authMechanism=DEFAULT&authSource=test

> admin - username

> password - password%2540mymongo (password@mymongo - '@' converted to percentage string %2540)

> authentication database - test
```
Create your schema Data and UpdateData Schema - the UpdateSymptom schema will be used to make changes to the Symptom schema
```python
class Symptom(BaseModel):
    nameStdSymptom: str
    synonyms: list
    symptomID: str
    associatedDx: list
    associatedImage: list
    associatedSound: list

class UpdateSymptom(BaseModel):
    nameStdSymptom: Optional[str]
    synonyms: Optional[list]
    symptomID: Optional[str]
    associatedDx: Optional[list]
    associatedImage: Optional[list]
    associatedSound: Optional[list]
```
## Frontend
Ensure to check the node version when [installing next.js and tailwindcss](https://tailwindcss.com/docs/guides/nextjs). Experienced challenges with node 12.12. Ensure to use `nvm` to [manage node versions in use.](https://heynode.com/tutorial/install-nodejs-locally-nvm/)
```bash
$ nvm ls
$ node --version
$ nvm install --lts
$ nvm use lts
```
Install [nextjs and tailwind](https://tailwindcss.com/docs/guides/nextjs)
```bash
$ npx create-next-app@latest frontend_project --eslint
$ cd frontend_project
$ npm install -D tailwindcss postcss autoprefixer
$ npx tailwind init -p
```
Disable telemetry
```bash
$ npx next telemetry disable
```

To start with your next js project run:
```bash
$ npm run dev
```
Next JS [app file structure](https://nextjs.org/blog/layouts-rfc)
```bash
├── .next
├── public
├── src
│   ├── components
│   ├── pages
│   ├── public
│   ├── styles
│   ├── utils
│   ├── store
│   └── ...
│── next.config.js
│── package.json
│── package-lock.json
│── README.md
├── node_modules
└── ...
```
- `components`: This folder contains reusable React components that can be used across multiple pages.
- `pages`: This folder contains the individual pages of your Next.js app, which are automatically converted into server-rendered pages by Next.js. This folder can contain subfolders to group related pages together.
- `public`: This folder contains static assets like images, which can be accessed by the client-side JavaScript code.

You can create multiple pages with their own [layouts (with src/page)](https://www.codeconcisely.com/posts/nextjs-multiple-layouts/) or [layouts (with src/app)](https://vercel.com/blog/next-js-layouts-rfc-in-5-minutes) such that `index.js` files can take the RootLayout however for per page layouts you can indicate them in `page/layout.js` files.
```bash
├── src
│   ├── components
│   ├── styles
│   ├── utils
│   ├── store
│   └── ...
│   ├── pages
│       ├── blog (can be blog/dashboard/login etc.)
│           ├── index.js
│           ├── error.js
│           ├── loading.js
│           └── settings.js 
```
Choosing the type of layout per page will be determined by the root `_app.js` which will call the getLayout function in `<ComponentLayout>`.
```javascript
export default function App({ Component, pageProps }) {
  // Use the layout defined at the page level, if available
  const getLayout = Component.getLayout || ((page) => page)
  return getLayout (
      <Component {...pageProps} />
  )
}
```
Page `index.js` will use the getLayout function to define the layout in its page based on the `<ComponentLayout>`
```javascript
// define the layout on a per-page basis
Dashboard.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}
```
[Server Side Rendering](https://www.youtube.com/watch?v=3Z_vR7WASwM) in Nextjs will pre-render this page on each request using the data returned by getServerSideProps. 
```javascript
export async function getServerSideProps(context){
    const nameStd = context.query
    let path = '/api/dx/'
    const res = await fetch(process.env.NEXT_PUBLIC_API_URL + path + nameStd.nameStd)
    const dx = await res.json()
    return {
        props: {dx}
    }
}
```
For ISR allows you to create or update static pages after you’ve built your site. Incremental Static Regeneration (ISR) enables you to use static-generation on a per-page basis, without needing to rebuild the entire site.
```javascript
// Fetch data from external API
    // ISR with revalidate
    const res = await fetch(server_url, {
        next : {
            revalidate: 60
        }
    })
```
FARM Stack Sources:
1. [FARM Stack FreeCodeCamp](https://www.youtube.com/watch?v=OzUzrs8uJl8)

   [FARM Stack from MongoDB](https://www.youtube.com/watch?v=IKmv0AuBwp0)

2. [CRUD RESTful API with FastAPI and MongoDB](https://medium.com/@wilde.consult/extensive-fastapi-with-mongodb-example-part1-ceff58e16f94)
3. [Docker](https://www.youtube.com/watch?v=gAkwW2tuIqE)
4. [FastAPI Mongo](https://testdriven.io/blog/fastapi-mongo/)
5. [Environment Variables](https://www.youtube.com/watch?v=A1OA0Y9vwJY)
5. [How to build with React](https://www.freecodecamp.org/news/how-to-build-a-react-app-different-ways/#how-react-works-under-the-hood)

FHIR Sources
1. [HAPI FHIR Open Server Endpoint](https://hapi.fhir.org/baseDstu3/swagger-ui/?page=Condition#/Condition/get_Condition__history)
2. [Google Cloud Healthcare API](https://github.com/google/android-fhir/wiki/FEL%3A-Getting-started)
3. [Smart on FHIR Tutorial](https://engineering.cerner.com/smart-on-fhir-tutorial/)
4. [FHIR Hapi FastAPI](https://sumanta9090.medium.com/building-a-fast-healthcare-interoperability-resources-fhir-server-with-fastapi-and-hapi-fhir-a66103b152b5)

Flutter Sources
1. [Flutter 4 CME](https://www.youtube.com/playlist?list=PL_e311Xg2aCSP5ATNC7OhgrVySGbQxWEF)
2. [Flutter FHIR](https://www.youtube.com/watch?v=4IZRCfx9Ves)
3. [FHIR-FLI Flutter Package](https://pub.dev/publishers/fhirfli.dev/packages)

Working with Ontologies
1. [OWL Ontologies Basics](https://www.youtube.com/playlist?list=PLea0WJq13cnDDe8V7eVLReIaOnFztOEAq)
2. [OWL Implementation in Python](https://hal.science/hal-01592746/document)