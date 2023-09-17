import DashboardLayout from "../../../../components/Layouts/DashboardLayout"
import CreateMedicalPlanForm from "./components/CreateMedicalPlanForm"
import { getAllDxHandler } from "../../../api/dxAllData"

export default function MedicalPlan({server_data}) {
    return (
        <main className='bg-background dark:bg-background min-h-screen'>
            <CreateMedicalPlanForm dxPlan={server_data}/>
        </main>
    )
}

// define the layout on a per-page basis
MedicalPlan.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}

// SSR
export async function getServerSideProps(){
    let data = await getAllDxHandler()
    return {
        props: {server_data: data}
    }
}