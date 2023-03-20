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
db.getUsers({
...     showCredentials: true
... })
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

FARM Stack Sources:
1. [FARM Stack FreeCodeCamp](https://www.youtube.com/watch?v=OzUzrs8uJl8)

   [FARM Stack from MongoDB](https://www.youtube.com/watch?v=IKmv0AuBwp0)

2. [CRUD RESTful API with FastAPI and MongoDB](https://codevoweb.com/crud-restful-api-server-with-python-fastapi-and-mongodb/)
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