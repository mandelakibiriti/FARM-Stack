from pydantic import BaseModel, Field
from datetime import datetime
from typing import Optional
import uuid

# Field(...) indicates the field is required
class Diagnosis(BaseModel):
    id: str = Field(default_factory=uuid.uuid4, alias="_id")
    nameStd : str
    icd10 : list
    diagnosisId : str
    diseaseClass : str
    definition : str
    background : str
    etiology : str
    epidemiology : str
    pathophysiology : str
    workup : str
    examinations : str
    vitalStatus : str
    laboratoryTest : str
    isAcute : bool
    isChronic : bool
    isAcuteonChronic : bool
    pharmacologicalTreatments : str
    interventionalTreatments : str
    lifestyleTreatments : str
    prevention : str
    differentialDx : str
    coMorbidities : str
    patientInfo : str
    references : str
    citations : str
    createDate: datetime
    publish : bool
    updateDate : datetime

    class Config:
        arbitrary_types_allowed = True
        schema_extra = {
            'id': 'unique assigned id',
            'nameStd' : 'Anthrax',
            'icd10': ['A22'],
            'diagnosisId' : 'id once added to diagnosis creator',
            'diseaseClass' : 'Infectious disease',
            'definition' : 'description of definition of the disease',
            'background' : 'brief pathophysiology description',
            'etiology' : 'causes and risk factors',
            'epidemiology' : 'incidence and prevalence',
            'pathophysiology' : 'description of effects on normal physiology',
            'workup' : 'description of diagnostic tests',
            'examinations' : 'key distinct primary clinical examination findings on physical examination, history and diagnostics',
            'vitalStatus' : 'vital sign findings and their relevant values',
            'laboratoryTest' : 'set of tests required to diagnose the condition',
            'isAcute' : 'bool value',
            'isChronic' : 'bool value',
            'isAcuteonChronic' : 'bool value',
            'pharmacologicalTreatments' : 'medication required to manage the condition',
            'interventionalTreatments' : 'surgical or procedural modes of management',
            'lifestyleTreatments' : 'patient education modes of management',
            'prevention' : 'preventive strategies',
            'differentialDx' : 'other diseases that may cause similar symptomatology',
            'coMorbidities' : 'risk factors',
            'patientInfo' : 'patient summary description',
            'references' : 'referenced materials',
            'citations' : 'relevant citations',
            'createdDate' : 'date added',
            'publish' : 'publish state is true draft state is false',
            'updateDate' : 'date updated when changes last made'
        }

# UpdateDiagnosis allows for optional update of fields in Diagnosis Schema
class UpdateDiagnosis(BaseModel):
    nameStd : Optional[str]
    icd10 : Optional[list]
    diagnosisId : Optional[str]
    diseaseClass : Optional[str]
    definition : Optional[str]
    background : Optional[str]
    etiology : Optional[str]
    epidemiology : Optional[str]
    pathophysiology : Optional[str]
    workup : Optional[str]
    examinations : Optional[str]
    vitalStatus : Optional[str]
    laboratoryTest : Optional[str]
    isAcute : Optional[bool]
    isChronic : Optional[bool]
    isAcuteonChronic : Optional[bool]
    pharmacologicalTreatments : Optional[str]
    interventionalTreatments : Optional[str]
    lifestyleTreatments : Optional[str]
    prevention : Optional[str]
    differentialDx : Optional[str]
    coMorbidities : Optional[str]
    patientInfo : Optional[str]
    references : Optional[str]
    citations : Optional[str]
    publish : Optional[bool]
    updateDate : datetime

    class Config:
        arbitrary_types_allowed = True
        schema_extra = {
            'example': {
                'nameStd' : 'Anthrax',
                'icd10': ['A22'],
                'diagnosisId' : 'id once added to diagnosis creator',
                'diseaseClass' : 'Infectious disease',
                'definition' : 'description of definition of the disease',
                'background' : 'brief pathophysiology description',
                'etiology' : 'causes and risk factors',
                'epidemiology' : 'incidence and prevalence',
                'pathophysiology' : 'description of effects on normal physiology',
                'workup' : 'description of diagnostic tests',
                'examinations' : 'key distinct primary clinical examination findings on physical examination, history and diagnostics',
                'vitalStatus' : 'vital sign findings and their relevant values',
                'laboratoryTest' : 'set of tests required to diagnose the condition',
                'isAcute' : 'bool value',
                'isChronic' : 'bool value',
                'isAcuteonChronic' : 'bool value',
                'pharmacologicalTreatments' : 'medication required to manage the condition',
                'interventionalTreatments' : 'surgical or procedural modes of management',
                'lifestyleTreatments' : 'patient education modes of management',
                'prevention' : 'preventive strategies',
                'differentialDx' : 'other diseases that may cause similar symptomatology',
                'coMorbidities' : 'risk factors',
                'patientInfo' : 'patient summary description',
                'references' : 'referenced materials',
                'citations' : 'relevant citations',
                'createDate' : 'date added',
                'publish' : 'publish state true draft state is false',
                'updateDate' : 'date updated when changes last made'
            }
        }


class Symptom(BaseModel):
    id: str = Field(default_factory=uuid.uuid4, alias="_id")
    nameStdSymptom: str
    synonyms: list
    symptomID: str
    associatedDx: list
    associatedImage: list
    associatedSound: list

    class Config:
        arbitrary_types_allowed = True
        schema_extra = {
                "example": {
                "id" : "unique id",
                "nameStdSymptom": "Headache",
                "synonyms": [
                    "migraine", "cephalagia", "head pain"
                ],
                "symptomID": "1",
                "associatedDx": [
                    "Migraine Headache", "Cluster Headache"
                ],
                "associatedImage": [
                    "url of image"
                ],
                "associatedSound": [
                    "url of sound"
                ]
            }
        }

class UpdateSymptom(BaseModel):
    nameStdSymptom: Optional[str]
    synonyms: Optional[list]
    symptomID: Optional[str]
    associatedDx: Optional[list]
    associatedImage: Optional[list]
    associatedSound: Optional[list]

    class Config:
        arbitrary_types_allowed = True
        schema_extra = {
                "example": {
                "nameStdSymptom": "Headache",
                "synonyms": [
                    "migraine", "cephalagia", "head pain"
                ],
                "symptomID": "1",
                "associatedDx": [
                    "Migraine Headache", "Cluster Headache"
                ],
                "associatedImage": [
                    "url of image"
                ],
                "associatedSound": [
                    "url of sound"
                ]
            }
        }