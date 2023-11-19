"use client"
import {AiFillCaretDown, AiFillCaretUp, AiOutlinePause} from "react-icons/ai";
import { Text, Metric } from "@tremor/react";

export default function TopCard({Items}) {

    return (
        <div className="col-auto bg-slate-200 p-4 rounded-lg w-full dark:bg-slate-900 border-primary hover:border-l-4 duration-200 drop-shadow-lg">
            <div className="flex justify-between">
                <div className="flex flex-col p-2">
                    <Text className="text-sm dark:text-white">
                        {Items.Label}
                    </Text>
                    <Metric className="text-xl text-gray-600 dark:text-white font-bold">
                        {Items.Value}
                    </Metric>
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
                        {Items.Percentage}
                    </p>
                </div>
            </div>
        </div>
    )
}