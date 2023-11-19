import UpdateDiseaseDetailsForm from "./components/UpdateDiseaseDetailsForm";
import DashboardLayout from "@/components/Layouts/DashboardLayout";

export default function DiseaseForm({dx}){ 
    return (
        <div className='bg-gray-100 min-h-screen space-y-4'>
            <UpdateDiseaseDetailsForm dxData={dx}/>
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

// getStaticPaths
export async function getStaticPaths() {
    // Call an external API endpoint to get data
    const res = await fetch(process.env.NEXT_GET_ALL_DXs);
    const dxs = await res.json();

    // Get the paths we want to pre-render based on data
    const paths = dxs.map((dx) => (
        {
            params: { id: dx._id }
        }
    ));
    // We'll pre-render only these paths at build time.
    // { fallback: false } means other routes should 404.
    return {
        paths: paths,
        fallback: false
    };
}

// getStaticProps
export async function getStaticProps(context) {
    const id = context.params.id;
    const res = await fetch(`${process.env.NEXT_GET_ALL_DXs}/${id}`);
    const data = await res.json();
    return {
        props: { dx: data }
    };
}

