"use client"
import {useEffect, useState} from "react";
import {BsSunFill, BsMoonFill} from "react-icons/bs";
import {useTheme} from "next-themes";

function Header() {
    const [mounted, setMounted] = useState(false);
    const { theme, setTheme } = useTheme();

    // Enforce CSR
    useEffect(()=>{
        setMounted(true);
    },[])

    if(!mounted){
        return null
    }

    let themeStatus;
    if(theme == "dark"){
        themeStatus = false;
    }if(theme == "light"){
        themeStatus = true;
    }

    return (
        <div className="flex justify-between ml-4 mr-4 pt-5 px-2">
            <h2 className="font-medium"> Welcome </h2>
            <h2 className="font-medium"> Hi Mandela </h2>

            <div className="-mt-2 p-2.5">
                {themeStatus ?

                <button onClick={() => setTheme('dark')} className="text-gray-500">
                    <BsMoonFill className="text-2xl"/>
                </button>
                :
                <button onClick={() => setTheme('light')} className="text-gray-100">
                    <BsSunFill className="text-2xl"/>
                </button>   
                }
            </div>
        </div>
    )
}

export default Header