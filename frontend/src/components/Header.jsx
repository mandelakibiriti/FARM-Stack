"use client"
import {MdLightMode, MdDarkMode} from "react-icons/md";
import {useTheme} from "next-themes";

function Header() {
    const { theme, setTheme } = useTheme();
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

                <button onClick={() => setTheme('dark')} id="theme-toggle" data-tooltip-target="tooltip-toggle" type="button" className="text-gray-500">
                    <MdDarkMode className="text-2xl"/>
                </button>
                :
                <button onClick={() => setTheme('light')} id="theme-toggle" data-tooltip-target="tooltip-toggle" type="button" className="text-gray-100">
                    <MdLightMode className="text-2xl"/>
                </button>   
                }
            </div>

        </div>
    )
}

export default Header