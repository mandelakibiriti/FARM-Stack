import { useState } from "react"
import Link from "next/link"
import {IoIosRefresh, IoIosRemoveCircleOutline, IoIosAddCircleOutline} from "react-icons/io"
import DeleteModal from "@/components/DeleteModal"

export default function DiseaseList({dxTitle}) {
    // Delete Modal
    const [ showDeleteModal, setShowDeleteModal ] = useState(false);
    const [ modalData, setModalData ] = useState(null);
    const closeModalHandler = () => {
        setShowDeleteModal(false);
    }

    // Search items in list
    const [ search, setSearch ] = useState('')
    // set the value of our useState query anytime the user types on our input
    const handleChange = (e) => {
        setSearch(e.target.value)
    }

    return (
        <div>
            <div className="gap-4 p-5">
                <label htmlFor="default-search" className="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
                <div className="relative">
                    <input onChange={handleChange} type="search" id="default-search" className="block w-full p-4 pl-5 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:outline-none focus:ring-indigo-500 focus:border-indigo-500" placeholder="Search by diagnosis name">
                    </input>
                    <button type="submit" className="hover:scale-105 motion-reduce text-white absolute right-2.5 bottom-2.5 bg-indigo-700 hover:bg-indigo-800 focus:ring-4 focus:outline-none focus:ring-purple-300 font-medium rounded-lg text-sm px-4 py-2">
                        <svg aria-hidden="true" className="w-5 h-5" fill="none" stroke="currentColor" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg"><path strokeLinecap="round" strokeLinejoin="round" strokeWidth="2" d="M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0z"></path></svg>
                        <span className="sr-only">Search</span>
                    </button>
                </div>

                <button type="button" className="text-white bg-indigo-700 hover:bg-indigo-800 font-sm rounded-lg text-sm my-2 p-2">       
                    <Link href={{
                        pathname:'/diseaseList/addDisease' // Update Diagnosis URL
                    }}>
                        <div className="inline-flex">
                            <IoIosAddCircleOutline className="my-1 mr-2"/>
                            <span>Add Diagnosis</span>
                        </div>
                    </Link>
                </button>
            </div>
            
            { dxTitle.props.filter((item) => { // Search Function
                return search.toLowerCase() === '' ? item : item.nameStd.toLowerCase().includes(search)
            }).map((dx) =>(        
                <div className="gap-4 p-5 group" key={dx._id}> 

                    <div className="flex justify-between bg-white p-4 rounded-lg hover:bg-slate-50">
                        
                        <label htmlFor="nameStd" className="text-m font-medium text-gray-900 dark:text-black">{dx.nameStd}</label>
                        <div className="justify-end">

                            <button type="button" className="invisible group-hover:visible hover:bg-gray-500 text-white bg-[#2557D6] font-sm rounded-lg text-sm mr-2 p-1">
                                <Link href={{
                                    pathname:`/diseaseList/${dx._id}`,
                                    query: encodeURI(dx) // Update Diagnosis URL
                                }}> 
                                    <div className="inline-flex">
                                        <span className="mr-2">Update</span>
                                        <IoIosRefresh className="my-1"/>
                                    </div>
                                </Link>
                            </button>
                            
                            <button 
                                onClick={() => {
                                    setShowDeleteModal(true);
                                    setModalData(dx);
                                }}
                                type="button" 
                                className="invisible group-hover:visible hover:bg-gray-500 text-white bg-[#be185d] font-sm rounded-lg text-sm mr-2 p-1"
                            >
                                <div className="inline-flex">
                                    <span className="mr-2">Delete</span>
                                    <IoIosRemoveCircleOutline className="my-1"/>
                                </div>
                            </button>

                            <div className="inline-flex">
                                {
                                    dx.publish ?
                                    <span className="inline-flex items-center bg-green-100 text-green-800 text-xs font-medium mr-2 px-2.5 py-1 rounded-full">
                                        <span className="w-2 h-2 mr-1 bg-green-500 rounded-full"></span>
                                        Published
                                        <span className="sr-only">Published</span>
                                    </span>
                                    :
                                    <span className="inline-flex items-center bg-yellow-100 text-yellow-600 text-xs font-medium mr-2 px-2.5 py-1 rounded-full">
                                        <span className="w-2 h-2 mr-1 bg-yellow-500 rounded-full"></span>
                                        Draft
                                        <span className="sr-only">Draft</span>
                                    </span>
                                }
                            </div>
                        </div>
                    </div>
                </div>
            ))}

            <DeleteModal 
                closeModal={closeModalHandler} 
                openModal={showDeleteModal} 
                data={modalData}
            />
        </div>
    )
}