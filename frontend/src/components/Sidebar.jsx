import Link from "next/link"
import { MdLogout } from "react-icons/md";
import { BsChevronDown, BsClipboardDataFill} from "react-icons/bs"
import { HiArrowSmallLeft, HiRectangleStack } from "react-icons/hi2"
import { FiSettings } from "react-icons/fi"
import { SiAlwaysdata } from "react-icons/si"
import { useState } from "react"

function Sidebar ({children}) {

    // Side bar expand state
    const [open, setOpen] = useState(false);

    const menu_items = [
        {
            title: "EHR Dashboard",
            icon: <BsClipboardDataFill/>,
            href: "#",
            submenu: true,
            visible: false,
            submenuItems: [
                {title: "Medical Cluster Information",href: "/dashboard"},
                {title: "Subscription Utilization",href: "#"},
                {title: "Special Projects",href: "#"}
            ]
        },
        {
            title: "Knowledge Base",
            icon: <HiRectangleStack/>,
            href: "#",
            submenu: true,
            visible: false,
            submenuItems: [
                {title: "Diagnosis Tracker",href: "/diseaseList"},
                {title: "Ontology Tracker",href: "#"}
            ]
        },
        {
            title: "Settings",
            href: "#",
            icon: <FiSettings/>
        },
        {
            title: "Logout",
            href: "#",
            icon: <MdLogout/>,
            spacing: true
        }
    ]

    const [menu, setMenu] = useState(menu_items);

    const onClickSubMenu = (index) => {
        menu[index].visible = !menu[index].visible;
        setMenu([...menu]);
    }

    return (
        <div className="flex">
            
            <div className={`h-screen z-40 fixed bg-indigo-900 p-5 duration-500 ${open ? "w-72" : "w-20"}`}>
                <HiArrowSmallLeft className={`bg-indigo-900 text-white text-3xl absolute -right-3 border-2 
                border-indigo-900 rounded-full cursor-pointer ${!open && "rotate-180"}`} onClick={() => setOpen(!open)}/>
            
                <div className="inline-flex cursor-pointer" onClick={() => setOpen(!open)}>
                    <SiAlwaysdata className={`text-white text-4xl block duration-500 ${!open && "rotate-[360deg] ml-2 text-4xl"}`}/>
                    <h1 className={`text-white origin-left font-light text-xl ml-4 ${!open && "scale-0"}`}>Data EHR</h1>
                </div>
                
                <div className="pt-2">
                    <span className="border-b-[2px] border-gray-300 w-full inline-flex"></span>

                    <ul className="pt-2">
                        {menu.map((item, index) => (
                            <li key={index} className={`text-white ${item.spacing ? "absolute bottom-0": "mt-2"}`}>
                                <div className="flex p-2 mb-4 mt-2 gap-x-4 hover:bg-gray-200 hover:text-indigo-900 rounded-lg" onClick={() => item.submenu ? onClickSubMenu(index): undefined}>
                                    <span className="text-2xl block float-left">
                                       {item.icon}
                                    </span>
                                    <Link href={item.href}>
                                        <span className={`text-base ml-2 font-medium flex-1 duration-200 ${!open && "hidden"}`}>
                                            {item.title}
                                        </span>
                                    </Link>
                                    {item.submenu && (
                                        <BsChevronDown className={`float-right flex-1 block ${item.visible && "rotate-180"}`} />
                                    )}
                                </div>

                                {item.visible && (
                                    <ul>
                                        {item.submenuItems.map((subitem,index) => (
                                                <li key={index} className={`text-white text-sm cursor-pointer p-2 px-8 mt-4 
                                                hover:bg-gray-200 hover:text-indigo-900 rounded-lg ${!open && "hidden"}`}>
                                                    <Link href={subitem.href}>
                                                        {subitem.title}
                                                    </Link>
                                                </li>
                                        ))}
                                    </ul>
                                )}
                            </li>
                        ))}
                    </ul>
                </div>            
            </div>

            <main className="ml-20 w-full">
                {children}
            </main>
        </div>
    )
}

export default Sidebar