import Link from "next/link";
import { useState } from "react";
import { useRouter } from "next/router";
import { useForm } from "react-hook-form";
import Loading from "@/components/Loading";

export default function DiagnosisDetailsForm({ dxData }) {
    // NextJS Router 
    const router = useRouter();

    // Button State
    const [loading, setLoading] = useState(true);
    
    // Date Handler
    const createDate = new Date(dxData.createDate)
    const lastUpdateDate = new Date(dxData.updateDate)
    const updateDate = new Date();
    const id = dxData._id

    // React Hook Form
    const {register, handleSubmit } = useForm();

    // Submit Handler
    const onSubmit = async (data) => {
        // Append non-input fields
        const newData = {...data, id, createDate, updateDate}
        try {
            // console.log(JSON.stringify(newData));
            const endpoint = process.env.NEXT_PUBLIC_API_URL + `/api/dx/${dxData.nameStd}`
            const options = {
                method: 'PUT',
                headers:{
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(newData)
            }
            const response = await fetch(endpoint, options);
            // Reload Form after changes to refetch data but place timeout for loading button state
            setTimeout(()=>{
                router.reload();
            },1000);
        } catch (e) {
            alert(e);
            console.log("Error!");
            console.log(e);
        }
    }
  
    return(
        <div className="dark:bg-black">
            <nav className="fixed shadow-lg w-full bg-white dark:bg-black">
                <div className="flex flex-wrap space-x-4 p-4">
                    <button 
                        form="dxForm"
                        type="submit"
                        onClick={()=>{
                            setLoading(false);
                        }}
                        className="px-6 text-white bg-primary rounded-full hover:bg-blue-800"
                    >
                        { loading ?  "Update" :  <Loading/>  }                
                    </button>
                    <button className="px-6 py-2 text-white bg-danger rounded-full hover:bg-rose-800 focus:outline-none focus:shadow-outline">
                        <Link href={'/diseaseList'}>
                            Cancel 
                        </Link> 
                    </button>
                    <div className="grid lg:grid-cols-3 grid-cols-2">
                        <span className="px-4 py-2.5 text-indigo-900 dark:text-white">{dxData.nameStd}</span>
                            {
                                dxData.publish ?
                                <span className="inline-flex items-center text-green-600 dark:text-green-200 text-sm font-medium px-5">
                                    <span className="w-2 h-2 mr-1 bg-green-500 dark:bg-green-200 rounded-full"></span>
                                    Published
                                </span>
                                :
                                <span className="inline-flex items-center text-yellow-600 dark:text-yellow-200 text-sm font-medium px-5">
                                    <span className="w-2 h-2 mr-1 bg-yellow-500 dark:bg-yellow-200 rounded-full"></span>
                                    Draft
                                </span>
                            }
                    </div>
                    <div className="flex py-2.5 text-sm font-medium text-gray-900 dark:text-gray-200 font-medium">
                        <p className="mr-2">Updated</p>
                        <span className="flex">
                            {lastUpdateDate.toDateString()}
                            <p className="ml-2 text-gray-500 dark:text-gray-200"> 
                            {lastUpdateDate.toLocaleTimeString()}
                            </p>
                        </span>
                    </div>
                </div>
            </nav>
            <div className="py-32 md:py-16">
                <form id="dxForm" 
                onSubmit={handleSubmit(onSubmit)} 
                key={dxData._id}>
                    <div className="grid gap-4 p-4"> 
                        <div className="grid gap-3 mb-6 p-4 rounded-lg">
                            <label htmlFor="nameStd" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">nameStd</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.nameStd}
                                {...register("nameStd")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Diagnosis name as per ICD 10" 
                            >
                            </input>

                            <label htmlFor="icd10" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">icd10</label>
                            <input 
                                type="text"     
                                defaultValue={dxData.icd10}
                                {...register("icd10",{
                                    setValueAs: v => v.split(",")
                                })}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="ICD 10 classes as per WHO" 
                            >    
                            </input>
                            
                            <label htmlFor="diagnosisId" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">diagnosisId</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.diagnosisId}
                                {...register("diagnosisId")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Diagnosis Id that is classified on the symptom checker" 
                            >
                            </input>
                            
                            <label htmlFor="diseaseClass" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">diseaseClass</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.diseaseClass}
                                {...register("diseaseClass")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Disease Class based on category of the disease" 
                            >
                            </input>
                            
                            <label htmlFor="definition" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">definition</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.definition}
                                {...register("definition")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Description of definition of the disease" 
                            >
                            </textarea>
                            
                            <label htmlFor="background" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">background</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.background}
                                {...register("background")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 pl-[10] dark:bg-gray-900 dark:text-white" 
                                placeholder="Brief pathophysiology description ie. diagnosis caused by this...results in symptoms that..." 
                            >
                            </textarea>

                            <label htmlFor="etiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">etiology</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.etiology}
                                {...register("etiology")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Causes and Risk Factors" 
                            >
                            </textarea>
                            
                            <label htmlFor="epidemiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">epidemiology</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.epidemiology}
                                {...register("epidemiology")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Incidence and Prevalence parameters" 
                            >
                            </input>
                            
                            <label htmlFor="pathophysiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">pathophysiology</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.pathophysiology}
                                {...register("pathophysiology")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Description of effects on normal physiology" 
                            >
                            </textarea>
                            
                            <label htmlFor="workup" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">workup</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.workup}
                                {...register("workup")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Description of diagnostic tests" 
                            >
                            </textarea>

                            <label htmlFor="examinations" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">examinations</label>
                            <textarea 
                                type="text" 
                                defaultValue={dxData.examinations}
                                {...register("examinations")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Key distinct primary clinical examination findings on physical examination, history and diagnosticss" 
                            >
                            </textarea>

                            <label htmlFor="vitalStatus" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">vitalStatus</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.vitalStatus}
                                {...register("vitalStatus")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white"
                                placeholder="Vital sign findings and their relevant values " 
                            >
                            </input>

                            <label htmlFor="laboratoryTest" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">laboratoryTest</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.laboratoryTest}
                                {...register("laboratoryTest")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Set of tests required to diagnose the condition" 
                            >
                            </input>

                            
                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block mb-2">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 border-b border-slate-200 pb-2 font-medium dark:text-white">Chronicity Status</legend>

                                <input 
                                    type="checkbox" 
                                    {...register("isAcute")}
                                    defaultChecked={dxData.isAcute}
                                    id="acute" 
                                    className="peer/acute mr-2 mb-0.5 border-slate-300 dark:border-gray-900 text-sky-400 focus:ring-sky-300 peer/acute"/>
                                <label htmlFor="acute" className="peer-checked/acute:text-sky-500 text-sm font-medium">Acute</label>
                                
                                <input 
                                    type="checkbox" 
                                    {...register("isAcuteonChronic")}
                                    id="acuteOnChronic" 
                                    defaultChecked={dxData.isAcuteonChronic}
                                    className="peer/acuteOnChronic mr-2 mb-0.5 ml-4 border-slate-300 dark:border-gray-900 text-sky-400 focus:ring-sky-300"/>
                                <label htmlFor="acuteOnChronic" className="peer-checked/acuteOnChronic:text-sky-500 text-sm font-medium">Acute on Chronic</label>

                                <input 
                                    type="checkbox" 
                                    {...register("isChronic")}
                                    id="chronic" 
                                    defaultChecked={dxData.isChronic}
                                    className="peer/chronic mr-2 mb-0.5 ml-4 border-slate-300 dark:border-gray-900 text-sky-400 focus:ring-sky-300"/>
                                <label htmlFor="chronic" className="peer-checked/chronic:text-sky-500 text-sm font-medium">Chronic</label>

                            </fieldset>
                            
                            <label htmlFor="pharmacologicalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">pharmacologicalTreatments</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.pharmacologicalTreatments}
                                {...register("pharmacologicalTreatments")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Medication required to manage the condition" 
                            >
                            </input>

                            <label htmlFor="interventionalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">interventionalTreatments</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.interventionalTreatments}
                                {...register("interventionalTreatments")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Surgical or procedural modes of management" 
                            >
                            </input>

                            <label htmlFor="lifestyleTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">lifestyleTreatments</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.lifestyleTreatments}
                                {...register("lifestyleTreatments")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Patient education methods of management" 
                            >
                            </input>

                            <label htmlFor="prevention" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">prevention</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.prevention}
                                {...register("prevention")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Public health preventive strategies"
                            >
                            </input>

                            <label htmlFor="differentialDx" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">differentialDx</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.differentialDx}
                                {...register("differentialDx")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Other diseases that may cause similar symptomatology" 
                            >
                            </input>

                            <label htmlFor="coMorbidities" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">coMorbidities</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.coMorbidities}
                                {...register("coMorbidities")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Risk factors for a condition" 
                            >
                            </input>
                            
                            <label htmlFor="patientInfo" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">patientInfo</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.patientInfo}
                                {...register("patientInfo")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Patient summary description" 
                            >
                            </input>

                            <label htmlFor="references" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">references</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.references}
                                {...register("references")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Referenced materials" 
                            >
                            </input>

                            <label htmlFor="citations" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">citations</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.citations}
                                {...register("citations")}
                                className="mt-1 block w-full bg-gray-50 shadow-sm border-slate-300 dark:border-gray-900 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-primary-500 focus:border-primary-500 p-3 dark:bg-gray-900 dark:text-white" 
                                placeholder="Relevant citations" 
                            >
                            </input>

                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block mb-2">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 border-b border-slate-200 pb-2 font-medium dark:text-white">published status</legend>

                                <input 
                                    id="draft" 
                                    className="form-radio mr-2 mb-0.5 border-slate-300 dark:border-gray-900 text-sky-400 focus:ring-sky-300" 
                                    type="radio"
                                    value="false"
                                    defaultChecked={!dxData.publish}
                                    {...register("publish", {required: true})}
                                />
                                <label htmlFor="draft" className="peer-checked/draft:text-sky-500 text-sm font-medium">Draft</label>

                                <input 
                                    id="published" 
                                    className="form-radio mr-2 mb-0.5 ml-4 border-slate-300 dark:border-gray-900 text-sky-400 focus:ring-sky-300" 
                                    type="radio"
                                    value="true"
                                    defaultChecked={dxData.publish}
                                    {...register("publish", {required: true})}
                                />
                                <label htmlFor="published" className="peer-checked/published:text-sky-500 text-sm font-medium">Published</label>
                            </fieldset>
   
                            <p className="block mb-2 text-sm font-medium text-gray-900 border-b border-slate-200 pb-2 font-medium dark:text-white">date created</p>
                            <span className="flex mb-2 text-sm font-medium text-gray-900 pb-2 font-medium dark:text-white">
                                {createDate.toDateString()}
                                <span className="ml-2">{createDate.toLocaleTimeString()}</span>
                            </span>
                        </div>
                    </div>
                </form>
            </div>
        </div>
   )
}