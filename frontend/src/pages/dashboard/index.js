import Link from "next/link"
import DashboardLayout from "../../components/Layouts/DashboardLayout"
import TopCard from "./components/TopCard"
import Header from "@/components/Header"
import {IoIosAddCircleOutline} from "react-icons/io" 

export default function Dashboard() {
    const topCard_items = [
        {
            "Label": "Consultation Providers",
            "Value": "50 Providers",
            "Percentage": 0,
            "Status" : "stable"
        },
        {
            "Label": "Physical Providers",
            "Value": "130 Centers",
            "Percentage": 10,
            "Status" : "critical"
        },
        {
            "Label": "Consultations",
            "Value": "300 consults",
            "Percentage": 10,
            "Status" : "good"
        },
        {
            "Label": "Registered Subscribers",
            "Value": "300 Subscribers",
            "Percentage": 10,
            "Status" : "critical"
        },
        {
            "Label": "Subscription Utilization",
            "Value": "Ksh. 3,000,000",
            "Percentage": 10,
            "Status" : "good"
        },
        {
            "Label": "Subscriptions Paid",
            "Value": "Ksh. 10,000,000",
            "Percentage": 60,
            "Status" : "good"
        }        
    ]

    return (
        <div className="bg-gray-100 min-h-screen">
            <Header/>
            <div className="grid lg:grid-cols-3 p-4 gap-4 rounded-lg">
                {topCard_items.map((item,index) => (
                    <TopCard Items={item} key={index}/>
                ))}
            </div>

            <div className="p-4">
                <div className="flex gap-x-4 justify-end">
                    <button type="button" className="text-white bg-indigo-700 hover:bg-indigo-800 font-sm rounded-lg text-sm my-2 p-2">       
                            <Link href={{
                                pathname:'/dashboard/pages/medicalplan'
                            }}>
                                <div className="inline-flex">
                                    <IoIosAddCircleOutline className="my-1 mr-2"/>
                                    <span>Add Medical Plan</span>
                                </div>
                            </Link>
                    </button>

                    <button type="button" className="text-white bg-indigo-700 hover:bg-indigo-800 font-sm rounded-lg text-sm my-2 p-2">       
                            <Link href={{
                                pathname:'/dashboard/pages/cluster'
                            }}>
                                <div className="inline-flex">
                                    <IoIosAddCircleOutline className="my-1 mr-2"/>
                                    <span>Add Cluster</span>
                                </div>
                            </Link>
                    </button>
                </div>
            </div>
        </div>
    )
}

Dashboard.getLayout = function getLayout(page) {
    return (
        <DashboardLayout>
            {page}
        </DashboardLayout>
    )
}