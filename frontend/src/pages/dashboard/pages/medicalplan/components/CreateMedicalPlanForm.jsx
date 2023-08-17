import { useState } from "react";
import { useForm } from "react-hook-form";
import Link from "next/link"
import Loading from "../../../../../components/Loading";
import {AiOutlineForm, AiOutlineFileJpg, AiOutlineCloudUpload} from "react-icons/ai";

export default function CreateMedicalPlan() {

    // Button State
    const [loading, setLoading] = useState(true);
    // React Hook Form
    const {register, handleSubmit, formState: { errors }, getValues } = useForm();

    return(
        <div>
            <nav className="fixed shadow-lg w-full bg-white navbar">
                <div className="flex justify-end mr-20 p-5 gap-x-4">
                    <button 
                            form="dxForm"
                            type="submit"
                            className="px-4 py-2 text-white bg-indigo-900 rounded-full hover:bg-blue-800 focus:outline-none focus:shadow-outline"
                        >
                            { loading ?  "Save Plan" :  <Loading/>  }           
                    </button> 

                    <Link href={'/dashboard'}>
                        <button className="px-4 py-2 text-white bg-rose-600 rounded-full hover:bg-rose-800 focus:outline-none focus:shadow-outline">
                            Cancel 
                        </button>
                    </Link>                            
                </div>
            </nav>

            <div className="py-32 lg:py-18 ml-6 flex justify-center">
                <div className="grid lg:grid-cols-2 grid-cols-1">
                    <div className="flex flex-col">
                        <div className="flex">
                            <AiOutlineForm className="text-indigo-900 text-3xl"/>
                            <span className="ml-2 text-indigo-900 font-bold text-xl">Create Medical Plan</span>
                        </div>

                        {/* Form Section */}
                        <form id="dxForm" 
                        onSubmit={'handleSubmit(onSubmit)'}
                        >
                            <div className="mt-2 mr-6"> 
                                <div className="rounded-lg">
                                    <label htmlFor="patient_id" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Patient ID</label>
                                    <input 
                                        type="text" 
                                        id="patient_id"
                                        {...register("patient_id", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Patient Identifier" 
                                    >
                                    </input>
                                    {errors.patient_name && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                                    <label htmlFor="patient_name" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Patient Name</label>
                                    <input 
                                        type="text" 
                                        id="Patient Name"
                                        {...register("patient_name", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Name" 
                                    >
                                    </input>
                                    {errors.patient_name && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                                    <label htmlFor="active_diagnosis" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Active Diagnosis</label>
                                    <input 
                                        type="text" 
                                        id="Active Diagnosis"
                                        {...register("active_diagnosis", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Active Diagnosis" 
                                    >
                                    </input>
                                    {errors.active_diagnosis && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                    
                                    <label htmlFor="icd_10" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Icd 10</label>
                                    <input 
                                        type="text" 
                                        id="icd_10"
                                        {...register("icd_10", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="icd_10" 
                                    >
                                    </input>
                                    {errors.icd_10 && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                    
                                    <label htmlFor="notes" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Notes</label>
                                    <textarea 
                                        type="text" 
                                        id="notes"
                                        {...register("notes", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                    >
                                    </textarea>
                                    {errors.notes && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                </div>
                            </div>
                        </form>
                    </div>

                    {/* Upload Documents Section */}
                    <div className="flex flex-col lg:mt-0 mt-8 mr-6">
                        <div className="flex mb-4">
                            <AiOutlineFileJpg className="text-indigo-900 text-3xl"/>
                            <span className="ml-2 text-indigo-900 font-bold text-xl">Upload Documents</span>
                        </div>
                        <div className="box-border border-0.5 border-dashed border-indigo-300 rounded-lg h-4/5 lg:h-96 lg:w-4/5 w-full p-4 border-2 bg-indigo-50">
                            <div className="flex flex-col items-center my-20">
                                <AiOutlineCloudUpload className="text-indigo-300 text-8xl"/>
                                <p className="text-sm p-2 text-center text-gray-500">Attach documents / images .png, .pdf, .docx or .doc format</p>
                                {/* TODO: ADD UPLOAD FEATURE */}
                                <button className="bg-indigo-600 p-2 border rounded-lg">
                                    <span className="text-white">Browse Files</span>
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    )
}