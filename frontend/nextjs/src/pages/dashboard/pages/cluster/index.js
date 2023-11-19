import DashboardLayout from "../../../../components/Layouts/DashboardLayout";
import CreateClusterForm from "../cluster/components/CreateClusterForm";
import { getAllDxHandler } from "../../../api/dxAllData";

export default function Cluster({server_data}) {
    return (
        <main className='bg-gray-100 dark:bg-background min-h-screen'>
            <CreateClusterForm clusterData={server_data}/>
        </main>
    )
}

// define the layout on a per-page basis
Cluster.getLayout = function getLayout(page) {
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
