import Header from "@/components/Header"
import DashboardLayout from "@/components/Layouts/DashboardLayout"
import DiseaseList from "@/pages/diseaseList/components/DiseaseList"

export default function Diseases({server_data}) {
    return (
        <main className='bg-white dark:bg-background h-screen'>
            <Header/>
            <DiseaseList dxData={server_data}/>
        </main>
    )
}

// define the layout on a per-page basis
Diseases.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}

// getServerSideProps
export async function getServerSideProps(){
    // Fetch data from external API
    let server_url = process.env.NEXT_GET_ALL_DXs

    // ISR with revalidate
    const res = await fetch(server_url, {
        next : {
            revalidate: 60
        }
    })
    if (!res.ok) {
        // This will activate the closest `error.js` Error Boundary
        console.log('Failed to fetch data');
        return {
            notFound: true
        }
    }
    let data = await res.json()
    console.log("Data Aquired Success!");
    return { 
        props: {server_data: data}
    };
}