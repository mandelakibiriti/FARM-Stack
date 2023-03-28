import Header from "@/components/Header"
import DashboardLayout from "../../components/Layouts/DashboardLayout"

function Dashboard({server_data}) {
    return (
        <main className='bg-gray-100 min-h-screen'>
            <Header/>
                {
                server_data.map((dx) => (
                    <form action="" key={dx.nameStd}>
                        <div className="grid gap-4 p-4"> 
                            <div className="grid gap-3 mb-6 bg-gray-50 p-4 rounded-lg">
                                <label htmlFor="nameStd" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">nameStd</label>
                                <input type="text" id="nameStd" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis name as per ICD 10" required></input>

                                <label htmlFor="icd10" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">icd10</label>
                                <input type="text" id="icd10" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="ICD 10 classes as per WHO" required></input>
                                
                                <label htmlFor="diagnosisId" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">diagnosisId</label>
                                <input type="text" id="diagnosisId" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis Id that is classified on the symptom checker" required></input>
                                
                                <label htmlFor="diagnosisClass" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">diagnosisClass</label>
                                <input type="text" id="diagnosisClass" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis Class based on category of the disease" required></input>
                                
                                <label htmlFor="definition" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">definition</label>
                                <input type="text" id="definition" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Description of definition of the disease" required></input>
                                
                                <label htmlFor="background" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">background</label>
                                <textarea type="text" id="background" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3 pl-[10]" placeholder="Brief pathophysiology description ie. diagnosis caused by this...results in symptoms that..." required></textarea>

                                <label htmlFor="etiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">etiology</label>
                                <input type="text" id="etiology" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Etiology" required></input>
                                
                                <label htmlFor="epidemiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">epidemiology</label>
                                <input type="text" id="epidemiology" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis name" required></input>

                                {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                                This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                                Otherwise, set either `onChange` or `readOnly`. */}
                                <fieldset className="mt-1 block mb-2">
                                    <legend className="block mb-2 text-sm font-medium text-gray-900 dark:text-black border-b border-slate-200 pb-2 font-medium">published status</legend>

                                    <input id="draft" className="peer/draft form-radio mr-2 mb-0.5 border-slate-300 text-sky-400 focus:ring-sky-300 peer/draft" type="radio" name="status" defaultChecked />
                                    <label htmlFor="draft" className="peer-checked/draft:text-sky-500 text-sm font-medium">Draft</label>

                                    <input id="published" className="peer/published form-radio mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300" type="radio" name="status" />
                                    <label htmlFor="published" className="peer-checked/published:text-sky-500 text-sm font-medium">Published</label>
                                </fieldset>
                            </div>
                        </div>
                    </form>
                ))
                }
        </main>
    )
}

// define the layout on a per-page basis
Dashboard.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}

export async function getServerSideProps(){
    let path = '/api/dx'
    let server_url = process.env.NEXT_PUBLIC_API_URL + path
    // console.log(server_url)
    // Fetch data from external API
    const res = await fetch(server_url)
    if (!res.ok) {
        // This will activate the closest `error.js` Error Boundary
        console.log('Failed to fetch data');
        return {
            notFound: true
        }
    }
    const data = await res.json()
    console.log("Data Aquired Success!")
    return { 
        props: {server_data: data}
    }
}


export default Dashboard