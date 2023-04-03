import { useState } from "react"

export default function DiagnosisDetailsForm({ dxData }) {
    const [ formData, setformData ] = useState({})

    return(
        <div>
            <nav className="fixed shadow-lg w-full bg-white navbar">
                <div className="flex flex-wrap space-x-6 p-4">
                    <button form="dxForm" type="submit" className="px-4 py-2 font-bold text-white bg-indigo-900 rounded-full hover:bg-green-800 focus:outline-none focus:shadow-outline">Save</button>
                    <div className="grid grid-cols-3 divide-x">
                        <span className="px-4 py-2 text-indigo-900 font-bold ">{dxData.nameStd}</span>
                        {/* TODO: Conditional Formatting based on status */}
                        <span className="inline-flex items-center text-green-600 text-xs font-medium px-5 py-0.5">
                            <span className="w-2 h-2 mr-1 bg-green-500 rounded-full"></span>
                            Published
                        </span>

                        <span className="inline-flex items-center text-yellow-600 text-xs font-medium px-5 py-0.5">
                            <span className="w-2 h-2 mr-1 bg-yellow-500 rounded-full"></span>
                            Draft
                        </span>
                    </div>
                </div>
            </nav>
            <div className="py-16">
                <form id="dxForm" method="POST" action="/api/dx/$(dxData.nameStd)" key={dxData.nameStd}>
                    <div className="grid gap-4 p-4"> 
                        <div className="grid gap-3 mb-6 p-4 rounded-lg">
                            <label htmlFor="nameStd" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">nameStd</label>
                            <input 
                                type="text" 
                                defaultValue={dxData.nameStd}
                                onChange = {e => setformData(e.target.value)}
                                id="nameStd" 
                                className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" 
                                placeholder="Diagnosis name as per ICD 10" 
                                required></input>

                            <label htmlFor="icd10" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">icd10</label>
                            <input type="text" id="icd10" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="ICD 10 classes as per WHO" required></input>
                            
                            <label htmlFor="diagnosisId" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">diagnosisId</label>
                            <input type="text" id="diagnosisId" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis Id that is classified on the symptom checker" required></input>
                            
                            <label htmlFor="diagnosisClass" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">diagnosisClass</label>
                            <input type="text" id="diagnosisClass" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Diagnosis Class based on category of the disease" required></input>
                            
                            <label htmlFor="definition" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">definition</label>
                            <textarea type="text" id="definition" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Description of definition of the disease" required></textarea>
                            
                            <label htmlFor="background" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">background</label>
                            <textarea type="text" id="background" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3 pl-[10]" placeholder="Brief pathophysiology description ie. diagnosis caused by this...results in symptoms that..." required></textarea>

                            <label htmlFor="etiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">etiology</label>
                            <textarea type="text" id="etiology" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Causes and Risk Factors" required></textarea>
                            
                            <label htmlFor="epidemiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">epidemiology</label>
                            <input type="text" id="epidemiology" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Incidence and Prevalence parameters" required></input>
                            
                            <label htmlFor="pathophysiology" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">pathophysiology</label>
                            <textarea type="text" id="pathophysiology" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Key distinct primary clinical examination findings on physical examination, history and diagnostics" required></textarea>
                            
                            <label htmlFor="workup" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">workup</label>
                            <textarea type="text" id="workup" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Description of diagnostic tests" required></textarea>

                            <label htmlFor="examination" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">examination</label>
                            <textarea type="text" id="examination" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Key distinct primary clinical examination findings on physical examination, history and diagnosticss" required></textarea>

                            <label htmlFor="vitalStatus" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">vitalStatus</label>
                            <input type="text" id="vitalStatus" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Vital sign findings and their relevant values " required></input>

                            <label htmlFor="laboratoryTest" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">laboratoryTest</label>
                            <input type="text" id="laboratoryTest" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Set of tests required to diagnose the condition" required></input>

                            
                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block mb-2">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 dark:text-black border-b border-slate-200 pb-2 font-medium">Chronicity Status</legend>

                                <input id="acute" className="peer/acute mr-2 mb-0.5 border-slate-300 text-sky-400 focus:ring-sky-300 peer/acute" type="checkbox" name="status" defaultChecked />
                                <label htmlFor="acute" className="peer-checked/acute:text-sky-500 text-sm font-medium">Acute</label>

                                <input id="chronic" className="peer/chronic mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300" type="checkbox" name="status" />
                                <label htmlFor="chronic" className="peer-checked/chronic:text-sky-500 text-sm font-medium">Chronic</label>

                                <input id="acuteOnChronic" className="peer/acuteOnChronic mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300" type="checkbox" name="status" />
                                <label htmlFor="acuteOnChronic" className="peer-checked/acuteOnChronic:text-sky-500 text-sm font-medium">Acute on Chronic</label>
                            </fieldset>
                            
                            <label htmlFor="pharmacologicalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">pharmacologicalTreatments</label>
                            <input type="text" id="pharmacologicalTreatments" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Medication required to manage the condition" required></input>

                            <label htmlFor="interventionalTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">interventionalTreatments</label>
                            <input type="text" id="interventionalTreatments" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Surgical or procedural modes of management" required></input>

                            <label htmlFor="lifestyleTreatments" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">lifestyleTreatments</label>
                            <input type="text" id="lifestyleTreatments" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Patient education methods of management" required></input>

                            <label htmlFor="prevention" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">prevention</label>
                            <input type="text" id="prevention" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Public health preventive strategies" required></input>

                            <label htmlFor="differentialDx" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">differentialDx</label>
                            <input type="text" id="differentialDx" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Other diseases that may cause similar symptomatology" required></input>

                            <label htmlFor="coMorbidities" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">coMorbidities</label>
                            <input type="text" id="coMorbidities" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Risk factors for a condition" required></input>
                            
                            <label htmlFor="patientInfo" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">patientInfo</label>
                            <input type="text" id="patientInfo" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Patient summary description" required></input>

                            <label htmlFor="references" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">references</label>
                            <input type="text" id="references" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Referenced materials" required></input>

                            <label htmlFor="citations" className="block mb-2 text-sm font-medium text-gray-900 dark:text-black">citations</label>
                            <input type="text" id="citations" className="mt-1 block w-full bg-gray-50 border-2 shadow-sm border-slate-300 text-gray-900 text-sm rounded-lg focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 p-3" placeholder="Relevant citations" required></input>

                            {/* TODO: client.js?4d30:1 Warning: You provided a `checked` prop to a form field without an `onChange` handler. 
                            This will render a read-only field. If the field should be mutable use `defaultChecked`. 
                            Otherwise, set either `onChange` or `readOnly`. */}
                            <fieldset className="mt-1 block mb-2">
                                <legend className="block mb-2 text-sm font-medium text-gray-900 dark:text-black border-b border-slate-200 pb-2 font-medium">published status</legend>

                                <input id="draft" className="peer/draft form-radio mr-2 mb-0.5 border-slate-300 text-sky-400 focus:ring-sky-300 peer/draft" type="radio" name="status" defaultChecked />
                                <label htmlFor="draft" className="peer-checked/draft:text-sky-500 text-sm font-medium">Draft</label>

                                <input id="published" className="peer/published form-radio mr-2 mb-0.5 ml-4 border-slate-300 text-sky-400 focus:ring-sky-300" type="radio" name="status" />
                                <label htmlFor="published" className="peer-checked/published:text-sky-500 text-sm font-medium">Published</label>
                            </fieldset>
                        </div>
                    </div>
                </form>
            </div>

        </div>
   )
}