import { useState } from "react"
import Link from "next/link"
import {IoIosArrowForward} from "react-icons/io"

export default function DiseaseList({dxTitle}) {
    const [search, setSearch ] = useState('')
    
    // set the value of our useState query anytime the user types on our input
    const handleChange = (e) => {
        setSearch(e.target.value)
    }

    return (
        <div>
            <div className="gap-4 p-2">
                <label htmlFor="default-search" className="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
                <div className="relative">
                    <input onChange={handleChange} type="search" id="default-search" className="block w-full p-4 pl-5 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500" placeholder="Search by diagnosis name" required>
                    
                    </input>
                    <button type="submit" className="text-white absolute right-2.5 bottom-2.5 bg-indigo-700 hover:bg-purple-800 focus:ring-4 focus:outline-none focus:ring-purple-300 font-medium rounded-lg text-sm px-4 py-2">
                    <svg aria-hidden="true" className="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
                        <span className="sr-only">Search</span>
                    </button>
                </div>
            </div>
            
            {/* map out new items based on text in search */}
            { dxTitle.props.filter((item) => {
                return search.toLowerCase() === '' ? item : item.nameStd.toLowerCase().includes(search)
            }).map((dx) =>(        
                <div className="gap-4 p-2" key={dx.nameStd}> 
                    <Link href={{
                        pathname:`/diseaseList/${dx.nameStd}`,
                        query: encodeURI(dx)
                    }}>
                        <div className="flex justify-between bg-gray-50 p-4 rounded-lg">
                            <label htmlFor="nameStd" className="text-sm font-medium text-gray-900 dark:text-black">{dx.nameStd}</label>
                            <div className="text-indigo-700">
                                <IoIosArrowForward size={20}/>
                            </div>
                        </div>
                    </Link>
                </div>
            ))}
        </div>
    )
}