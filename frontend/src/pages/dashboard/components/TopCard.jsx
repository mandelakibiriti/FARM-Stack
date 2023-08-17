import {AiFillCaretDown, AiFillCaretUp, AiOutlinePause} from "react-icons/ai";

export default function TopCard({Items}) {

    return (
        <div className="col-auto bg-white border p-4 rounded-lg w-full">
            <div className="flex justify-between">
                <div className="flex flex-col p-2">
                    <p className="text-2xl text-gray-600 font-bold">
                        {Items.Value}
                    </p>
                    <p className="text-sm">
                        {Items.Label}
                    </p>
                </div>
                <div className="flex items-center">
                    {Items.Status == "critical" && <AiFillCaretDown className="mr-2 text-xl text-red-400"/>}
                    {Items.Status == "good" &&  <AiFillCaretUp className="mr-2 text-xl text-green-400"/>}
                    {Items.Status == "stable" && <AiOutlinePause className="mr-2 text-xl text-yellow-400"/>}
                    <p className={`
                        ${Items.Status == "good" && "bg-green-200"} 
                        ${Items.Status == "stable" && "bg-orange-200"}
                        ${Items.Status == "critical" && "bg-red-200"}
                        p-5 rounded-lg text-lg`
                    }> 
                        {Items.Percentage} %
                    </p>
                </div>
            </div>
        </div>
    )
}