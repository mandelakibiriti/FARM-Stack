import Header from "@/components/Header"
import DashboardLayout from "@/components/Layouts/DashboardLayout"
import DiseaseList from "@/pages/diseaseList/components/DiseaseList"
import { getDxHandler } from "../lib/dxData"

export default function Diseases({server_data}) {
    return (
        <main className='bg-gray-100 min-h-screen'>
            <Header/>
            <DiseaseList dxTitle={server_data}/>
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

// SSR
export async function getServerSideProps(){
    let data = await getDxHandler()
    return {
        props: {server_data: data}
    }
}
