import Link from "next/link";
import { useState } from "react";
import { useForm } from "react-hook-form";
import { useRouter } from "next/router";
import Loading from "@/components/Loading";

export default function DiagnosisDetailsForm() {
    // Router
    const router = useRouter();

    // Date Handler
    const createDate = new Date()
    const updateDate = new Date()

    // React Hook Form
    const {register, handleSubmit, formState: { errors }, getValues } = useForm();


    // Submit Handler
    const onSubmit = async (data) => {
        // Handle string data and pass it into array
        const icd10String = getValues("icd10")
        const icd10 = icd10String.split(",")
        
        // Append non-input fields
        const newData = {...data, icd10, createDate, updateDate}
        try {
            // TODO: catch url error 404, 500, 
            // console.log(JSON.stringify(newData));
            const endpoint = process.env.NEXT_PUBLIC_API_URL + `/api/dx`
            const options = {
                method: 'POST',
                headers:{
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(newData)
            }
            const response = await fetch(endpoint, options)
            // TODO: Check to see if the items added on list is the same
            // If so do not allow to save
            if (response.ok) {
                // Reload Form after changes to refetch data but place timeout for loading button state
                setTimeout(()=>{
                    setLoading(false);
                    router.push('/diseaseList')
                }, 1000);
            }
        } catch (e) {
            console.log("Error!");
            console.log(e);
        }
    }
    
    // Button State
    const [loading, setLoading] = useState(true);
 
    return(
        <div className="dark:bg-black">
            <nav className="fixed shadow-md w-full bg-white dark:bg-gray-800">
                <div className="flex justify-end mr-20 p-5 gap-x-4">
                    <button 
                        form="dxForm"
                        type="submit"
                        className="ml-2 px-4 py-2 text-white bg-indigo-900 rounded-full hover:bg-blue-800 focus:outline-none focus:shadow-outline"
                    >
                        { loading ?  "Add Diagnosis" :  <Loading/>  }           
                    </button>

                    <Link href={'/diseaseList'}>
                        <button className="px-4 py-2 text-white bg-rose-600 rounded-full hover:bg-rose-800 focus:outline-none focus:shadow-outline">
                            Cancel 
                        </button>
                    </Link>     
          
                </div>
            </nav>
            {/* TOOD: FORM VALIDATION */}
            <div className="py-16">
                <form id="dxForm" 
                onSubmit={handleSubmit(onSubmit)}
                >
                    {/* {fields.map(field => {
                        return <>
                            <label htmlFor={field.name}>{field.label}</label>
                            <input type={field.type} autoComplete={field.autoComplete}
                                {...register(field.name, {required: field.required})} />
                            <div className="error">{errors[field.name]?.message}</div>
                        </>
                    })} */}
                    <div className="grid gap-4 p-4"> 
                        <div className="grid gap-3 mb-6 p-4 rounded-lg">
                            <label htmlFor="nameStd" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">nameStd</label>
                            <input 
                                type="text" 
                                id="nameStd"
                                {...register("nameStd", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Diagnosis name as per ICD 10" 
                            >
                            </input>
                            {errors.nameStd && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="icd10" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">icd10</label>
                            <input 
                                id="icd10"
                                type="text"     
                                {...register("icd10", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="ICD 10 classes as per WHO" 
                            >    
                            </input>
                            {errors.icd10 && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="diagnosisId" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">diagnosisId</label>
                            <input 
                                id="diagnosisId"
                                type="text" 
                                {...register("diagnosisId", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Diagnosis Id that is classified on the symptom checker" 
                            >
                            </input>
                            {errors.diagnosisId && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="diseaseClass" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">diseaseClass</label>
                            <input 
                                id="diseaseClass"
                                type="text" 
                                {...register("diseaseClass", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Disease Class based on category of the disease" 
                            >
                            </input>
                            {errors.diseaseClass && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="definition" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">definition</label>
                            <textarea 
                                id="definition"
                                type="text" 
                                {...register("definition", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Description of definition of the disease" 
                            >
                            </textarea>
                            {errors.definition && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="background" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">background</label>
                            <textarea 
                                type="text" 
                                {...register("background", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Brief pathophysiology description ie. diagnosis caused by this...results in symptoms that..." 
                            >
                            </textarea>
                            {errors.background && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="etiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">etiology</label>
                            <textarea 
                                id="etiology"
                                type="text" 
                                {...register("etiology", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Causes and Risk Factors" 
                            >
                            </textarea>
                            {errors.etiology && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="epidemiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">epidemiology</label>
                            <input
                                id="epidemiology" 
                                type="text" 
                                {...register("epidemiology", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Incidence and Prevalence parameters" 
                            >
                            </input>
                            {errors.epidemiology && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="pathophysiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">pathophysiology</label>
                            <textarea 
                                id="pathophysiology"
                                type="text" 
                                {...register("pathophysiology", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Description of effects on normal physiology" 
                            >
                            </textarea>
                            {errors.pathophysiology && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="workup" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">workup</label>
                            <textarea 
                                id="workup"
                                type="text" 
                                {...register("workup", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Description of diagnostic tests" 
                            >
                            </textarea>
                            {errors.workup && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            

                            <label htmlFor="examinations" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">examinations</label>
                            <textarea 
                                id="examinations"
                                type="text" 
                                {...register("examinations", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Key distinct primary clinical examination findings on physical examination, history and diagnosticss" 
                            >
                            </textarea>
                            {errors.examinations && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="vitalStatus" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">vitalStatus</label>
                            <input 
                                id="vitalStatus"
                                type="text" 
                                {...register("vitalStatus", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3"
                                placeholder="Vital sign findings and their relevant values " 
                            >
                            </input>
                            {errors.vitalStatus && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="laboratoryTest" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">laboratoryTest</label>
                            <input 
                                id="laboratoryTest"
                                type="text" 
                                {...register("laboratoryTest", {required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Set of tests required to diagnose the condition" 
                            >
                            </input>
                            {errors.laboratoryTest && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            
                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 dark:text-black border-b border-slate-300 pb-2 font-medium dark:text-white">Chronicity Status</legend>

                                <input 
                                    type="checkbox" 
                                    {...register("isAcute")}
                                    id="isAcute" 
                                    className="peer/acute mr-2 mb-0.5 border-slate-300 text-sky-400 focus:ring-sky-300 peer/acute"/>
                                <label htmlFor="isAcute" className="peer-checked/acute:text-sky-500 text-sm font-medium">Acute</label>
                                
                                <input 
                                    type="checkbox" 
                                    {...register("isAcuteonChronic")}
                                    id="isAcuteonChronic" 
                                    className="peer/acuteOnChronic mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300"/>
                                <label htmlFor="isAcuteonChronic" className="peer-checked/acuteOnChronic:text-sky-500 text-sm font-medium">Acute on Chronic</label>

                                <input 
                                    type="checkbox" 
                                    {...register("isChronic")}
                                    id="isChronic" 
                                    className="peer/chronic mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300"/>
                                <label htmlFor="isChronic" className="peer-checked/chronic:text-sky-500 text-sm font-medium">Chronic</label>
                            </fieldset>
                            <span className="text-indigo-500 font-medium text-sm">Choose at least one option</span>
                            
                            <label htmlFor="pharmacologicalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">pharmacologicalTreatments</label>
                            <input 
                                type="text" 
                                id="pharmacologicalTreatments"
                                {...register("pharmacologicalTreatments",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Medication required to manage the condition" 
                            >
                            </input>
                            {errors.pharmacologicalTreatments && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="interventionalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">interventionalTreatments</label>
                            <input 
                                type="text" 
                                id="interventionalTreatments"
                                {...register("interventionalTreatments",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Surgical or procedural modes of management" 
                            >
                            </input>
                            {errors.interventionalTreatments && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="lifestyleTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">lifestyleTreatments</label>
                            <input 
                                type="text" 
                                id="lifestyleTreatments"
                                {...register("lifestyleTreatments",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Patient education methods of management" 
                            >
                            </input>
                            {errors.lifestyleTreatments && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="prevention" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">prevention</label>
                            <input 
                                type="text"
                                id="prevention" 
                                {...register("prevention",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Public health preventive strategies"
                            >
                            </input>
                            {errors.prevention && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="differentialDx" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">differentialDx</label>
                            <input 
                                type="text" 
                                id="differentialDx"
                                {...register("differentialDx",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Other diseases that may cause similar symptomatology" 
                            >
                            </input>
                            {errors.differentialDx && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="coMorbidities" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">coMorbidities</label>
                            <input 
                                type="text"
                                id="coMorbidities" 
                                {...register("coMorbidities",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Risk factors for a condition" 
                            >
                            </input>
                            {errors.coMorbidities && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}
                            
                            <label htmlFor="patientInfo" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">patientInfo</label>
                            <input 
                                type="text" 
                                id="patientInfo"
                                {...register("patientInfo",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Patient summary description" 
                            >
                            </input>
                            {errors.patientInfo && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="references" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">references</label>
                            <input 
                                type="text"
                                id="references" 
                                {...register("references",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Referenced materials" 
                            >
                            </input>
                            {errors.references && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            <label htmlFor="citations" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">citations</label>
                            <input 
                                type="text" 
                                id="citations"
                                {...register("citations",{required:true})}
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Relevant citations" 
                            >
                            </input>
                            {errors.citations && <span className="text-indigo-500 font-medium text-sm">This field is required</span>}

                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block mb-2">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 dark:text-black border-b border-slate-300 pb-2 font-medium dark:text-white">published status</legend>

                                <input 
                                    id="draft" 
                                    className="form-radio mr-2 mb-0.5 border-slate-300 text-sky-400 focus:ring-sky-300" 
                                    type="radio"
                                    value="false"
                                    {...register("publish", {required: true})}
                                />
                                <label htmlFor="draft" className="peer-checked/draft:text-sky-500 text-sm font-medium">Draft</label>

                                <input 
                                    id="published" 
                                    className="form-radio mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300" 
                                    type="radio"
                                    value="true"
                                    {...register("publish", {required: true})}
                                />
                                <label htmlFor="published" className="peer-checked/published:text-sky-500 text-sm font-medium">Published</label>
                            </fieldset>
                            {errors.publish && <span className="text-indigo-500 font-medium text-sm">Choose at least one option</span>}
                        </div>
                    </div>
                </form>
            </div>
        </div>
   )
}