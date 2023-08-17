'use client'
import Link from "next/link";
import Loading from "@/components/Loading";
import { useState, useEffect } from "react";
import { useForm } from "react-hook-form";
import { AiOutlineForm, AiOutlineFileJpg, AiOutlineCloudUpload } from "react-icons/ai";
import { BsPinMapFill } from "react-icons/bs";

import Map from 'ol/Map.js';
import OSM from 'ol/source/OSM.js';
import TileLayer from 'ol/layer/Tile.js';
import View from 'ol/View.js';
import Script from 'next/script';
import style from '../styles/ol.module.css';

export default function CreateClusterForm() {
    // Map Item
    useEffect (() => {
        new Map({
            target: 'map',
            layers: [
                new TileLayer({
                    source: new OSM(),
                }),
            ],
            view: new View({
                center: [0, 0],
                zoom: 2,
            }),
        });
        console.log("render..")
    }, [])

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
                        { loading ?  "Save Cluster" :  <Loading/>  }           
                    </button> 

                    <Link href={'/dashboard'}>
                        <button className="px-4 py-2 text-white bg-rose-600 rounded-full hover:bg-rose-800 focus:outline-none focus:shadow-outline">
                            Cancel 
                        </button>
                    </Link>                            
                </div>
            </nav>

            <div className="py-32 lg:py-18 ml-6 flex justify-center">
                <div className="grid lg:grid-cols-3 md:grid-cols-1">
                    {/* Form Section */}
                    <div className="flex flex-col mb-8">
                        <div className="flex">
                            <AiOutlineForm className="text-indigo-900 text-3xl"/>
                            <span className="ml-2 text-indigo-900 font-bold text-xl">Add Cluster</span>
                        </div>
                        <form id="dxForm" 
                        // onSubmit={'handleSubmit(onSubmit)'}
                        >
                            <div className="mt-2 mr-6"> 
                                <div className="rounded-lg">
                                    <label htmlFor="cluster_id" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Cluster ID</label>
                                    <input 
                                        type="text" 
                                        id="cluster_id"
                                        {...register("cluster_id", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Cluster Identifier" 
                                    >
                                    </input>
                                    {errors.cluster_id && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                                    <label htmlFor="cluster_name" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Cluster Name</label>
                                    <input 
                                        type="text" 
                                        id="cluster_name"
                                        {...register("cluster_name", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Cluster Name" 
                                    >
                                    </input>
                                    {errors.cluster_name && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                                    <label htmlFor="service_offered" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Services Offered</label>
                                    <input 
                                        type="text" 
                                        id="service_offered"
                                        {...register("service_offered", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Services Offered" 
                                    >
                                    </input>
                                    {errors.service_offered && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                    
                                    <label htmlFor="location" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Cluster Location</label>
                                    <input 
                                        type="text" 
                                        id="location"
                                        {...register("location", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Cluster Location" 
                                    >
                                    </input>
                                    {errors.location && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                    
                                    <label htmlFor="facility_names" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Facilities</label>
                                    <input 
                                        type="text" 
                                        id="facility_names"
                                        {...register("facility_names", {required:true})}
                                        className="mt-1 mb-8 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                        placeholder="Facilities in cluster" 
                                    >
                                    </input>
                                    {errors.facility_names && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                                    <label htmlFor="notes" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">Notes</label>
                                    <textarea 
                                        type="text" 
                                        id="notes"
                                        {...register("notes", {required:true})}
                                        className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                    >
                                    </textarea>
                                    {errors.notes && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                                </div>
                            </div>
                        </form>
                    </div>
                    {/* Upload Documents Section */}
                    <div className="flex flex-col lg:mt-0 mt-8 mb-8">
                        <div className="flex mb-4">
                            <AiOutlineFileJpg className="text-indigo-900 text-3xl"/>
                            <span className="ml-2 text-indigo-900 font-bold text-xl">Upload Cluster Documents</span>
                        </div>
                        <div className="box-border border-0.5 border-dashed border-indigo-300 rounded-lg h-4/5 lg:h-96 w-11/12 p-4 border-2 bg-indigo-50">
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
                    {/* Map Section */}
                    <div className="flex flex-col">
                        <div className="flex">
                            <BsPinMapFill className="text-indigo-900 text-3xl"/>
                            <span className="ml-2 text-indigo-900 font-bold text-xl">Cluster Map</span>
                        </div>
                        <div className="mr-6">
                            <div id='map' className={`${style} mt-4 h-96 lg:h-96`}></div>
                            <Script src= "https://cdn.jsdelivr.net/npm/ol@v7.2.2/dist/ol.js" />
                        </div>
                    </div>

                </div>
            </div>
        </div>
    )
}