import Link from "next/link"
import { HiHome } from "react-icons/hi"
import { FiSettings } from "react-icons/fi"
import { RxBarChart, RxDashboard } from "react-icons/rx"

function Sidebar ({children}) {
    return (
        <div className="flex">
            <div className="fixed w-20 h-screen p-4 bg-white border-r-[1px] flex flex-col justify-between">
                <div className="flex flex-col items-center">
                    <Link href={'/'}>
                        <div className="bg-indigo-900 text-white p-3 rounded-lg inline-block">
                            <HiHome size={20}/>
                        </div>
                    </Link>
                    <span className="border-b-[2px] border-gray-300 w-full p-2"></span>
                    <Link href={'/diseaseList'}>
                        <div className="bg-gray-100 hover:bg-gray-200 cursor-pointer my-4 p-3 rounded-lg inline-block">
                            <RxDashboard size={20}/>
                        </div>
                    </Link>
                    <Link href={'/dashboard'}>
                        <div className="bg-gray-100 hover:bg-gray-200 cursor-pointer my-4 p-3 rounded-lg inline-block">
                            <RxBarChart size={20}/>
                        </div>
                    </Link>
                    <Link href={'/settings'}>
                        <div className="bg-gray-100 hover:bg-gray-200 cursor-pointer my-4 p-3 rounded-lg inline-block">
                            <FiSettings size={20}/>
                        </div>
                    </Link>
                </div>
            </div>
            <main className="ml-20 w-full">
                {children}
            </main>
        </div>
    )
}

export default Sidebar