import DiseaseDetailsForm from "./components/UpdateDiseaseDetailsForm"
import DashboardLayout from "@/components/Layouts/DashboardLayout"

export default function DiseaseForm({dx}){   
    return (
        <div className='bg-gray-100 min-h-screen space-y-4'>
            <DiseaseDetailsForm dxData={dx}/>
        </div>
    )
}

DiseaseForm.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}

// SSR
export async function getServerSideProps(context){
    const nameStd = context.query
    let path = '/api/dx/'
    const res = await fetch(process.env.NEXT_PUBLIC_API_URL + path + nameStd.nameStd)
    const dx = await res.json()
    return {
        props: {dx}
    }
}