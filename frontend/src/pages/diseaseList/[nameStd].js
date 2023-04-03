import React from "react"
import { useRouter } from "next/router"
import DiseaseDetailsForm from "./components/DiseaseDetailsForm"
import DashboardLayout from "@/components/Layouts/DashboardLayout"

export default function DiseaseForm(){
    const router = useRouter();
    const dx = router.query
    console.log(dx)
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