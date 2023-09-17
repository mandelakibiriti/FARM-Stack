import CreateDiseaseDetailsForm from "./components/CreateDiseaseDetailsForm"
import DashboardLayout from "@/components/Layouts/DashboardLayout"

export default function DiseaseForm(){   
    return (
        <div className='bg-gray-100 min-h-screen space-y-4'>
            <CreateDiseaseDetailsForm/>
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