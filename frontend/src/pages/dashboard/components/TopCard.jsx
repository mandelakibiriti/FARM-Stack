import {AiFillCaretDown, AiFillCaretUp, AiOutlinePause} from "react-icons/ai";

export default function TopCard({Items}) {

    return (
        <div className="col-auto bg-background p-4 rounded-lg w-full dark:bg-zinc-900 dark:shadow-small">
            <div className="flex justify-between">
                <div className="flex flex-col p-2">
                    <p className="text-2xl text-gray-600 dark:text-white font-bold">
                        {Items.Value}
                    </p>
                    <p className="text-sm dark:text-white">
                        {Items.Label}
                    </p>
                </div>
                <div className="flex items-center">
                    {Items.Status == "critical" && <AiFillCaretDown className="mr-2 text-xl text-red-400"/>}
                    {Items.Status == "good" &&  <AiFillCaretUp className="mr-2 text-xl text-green-400"/>}
                    {Items.Status == "stable" && <AiOutlinePause className="mr-2 text-xl text-yellow-400"/>}
                    <p className={`
                        ${Items.Status == "good" && "bg-green-400"} 
                        ${Items.Status == "stable" && "bg-orange-400"}
                        ${Items.Status == "critical" && "bg-red-400"}
                        p-5 rounded-lg text-lg dark:text-slate-900 font-medium`
                    }> 
                        {Items.Percentage} %
                    </p>
                </div>
            </div>
        </div>
    )
}