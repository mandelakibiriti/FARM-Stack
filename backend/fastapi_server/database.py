import motor.motor_asyncio
from . import schemas
from .config import Settings as db_settings

# Driver connects MongoDB with Fastapi
client = motor.motor_asyncio.AsyncIOMotorClient(db_settings.DB_URI)

#-------------------------------------------------------------------------------------
# DIAGNOSES
#-------------------------------------------------------------------------------------
diagnoses_database = client.Diagnoses
diagnoses_collection = diagnoses_database.get_collection('diagnosis_collection')

# helper function for parsing the results from a database query into a python dict
def diagnosis_helper(diagnosis) -> dict:
    return {
            'id' : str(diagnosis['_id']),
            'nameStd' : diagnosis['nameStd'],
            'icd10': diagnosis['icd10'],
            'diagnosisId' : diagnosis['diagnosisId'],
            'diseaseClass' : diagnosis['diseaseClass'],
            'definition' : diagnosis['definition'],
            'background' : diagnosis['background'],
            'etiology' : diagnosis['etiology'],
            'epidemiology' : diagnosis['epidemiology'],
            'pathophysiology' : diagnosis['pathophysiology'],
            'workup' : diagnosis['workup'],
            'examinations' : diagnosis['examinations'],
            'vitalStatus' : diagnosis['vitalStatus'],
            'laboratoryTest' : diagnosis['laboratoryTest'],
            'isAcute' : diagnosis['isAcute'],
            'isChronic' : diagnosis['isChronic'],
            'isAcuteonChronic' : diagnosis['isAcuteonChronic'],
            'pharmacologicalTreatments' : diagnosis['pharmacologicalTreatments'],
            'interventionalTreatments' : diagnosis['interventionalTreatments'],
            'lifestyleTreatments' : diagnosis['lifestyleTreatments'],
            'prevention' : diagnosis['prevention'],
            'differentialDx' : diagnosis['differentialDx'],
            'coMorbidities' : diagnosis['coMorbidities'],
            'patientInfo' : diagnosis['patientInfo'],
            'references' : diagnosis['references'],
            'citations' : diagnosis['citations'],
            'dateCreated' : diagnosis['dateCreated'],
            'publish' : diagnosis['publish'],
            'update' : diagnosis['update']
            }

# Get single entry
async def fetch_one_dx(nameStd: str) -> dict:
    document = await diagnoses_collection.find_one({"nameStd": nameStd})
    return document

# Get all entries
async def fetch_all_dx():
    dxs = []
    cursor = diagnoses_collection.find({})
    async for document in cursor:
        dxs.append(schemas.Diagnosis(**document))
    return dxs

# Create a single entry
async def add_dx(dx:dict) -> dict:
    document = await diagnoses_collection.insert_one(dx)
    new_diagnosis_document = await diagnoses_collection.find_one({"_id":document.inserted_id})
    return diagnosis_helper(new_diagnosis_document)

# Update an entry
async def update_dx(nameStd: str, data: dict):
    if len(data) < 1:
        return False
    document = await diagnoses_collection.find_one({"nameStd": nameStd})
    if document:
        updated_diagnosis = await diagnoses_collection.update_one(
            {"nameStd": nameStd}, {"$set":data}
        )
        if updated_diagnosis:
            return document
        return False

# Delete an entry
async def remove_dx(nameStd: str):
    document = await diagnoses_collection.find_one({"nameStd": nameStd})
    if document:
        await diagnoses_collection.delete_one({"nameStd": nameStd})
        return True

#-------------------------------------------------------------------------------------
# SYMPTOMS
#-------------------------------------------------------------------------------------

symptoms_database = client.Symptom
symptoms_collection = symptoms_database.get_collection('symptom_collection')

def symptoms_helper(symptom) -> dict:
    return {
        'id' : str(symptom['_id']),
        "nameStdSymptom" : symptom["nameStdSymptom"],
        "synonyms" : symptom["synonyms"],
        "symptomID" : symptom["symptomID"],
        "associatedDx" : symptom["associatedDx"],
        "associatedImage" : symptom["associatedImage"],
        "associatedSound" : symptom["associatedSound"]
    }

# Get single entry
async def fetch_one_symptom(nameStdSymptom: str) -> dict:
    document = await symptoms_collection.find_one({"nameStdSymptom": nameStdSymptom})
    return document

# Get all entries
async def fetch_all_symptom():
    symptoms = []
    cursor = symptoms_collection.find({})
    async for document in cursor:
        symptoms.append(schemas.Symptom(**document))
    return symptoms

# Create a single entry
async def add_symptom(dx:dict) -> dict:
    document = await symptoms_collection.insert_one(dx)
    new_symptom_document = await symptoms_collection.find_one({"_id":document.inserted_id})
    return symptoms_helper(new_symptom_document)

# Update an entry
async def change_symptom(nameStdSymptom: str, data: dict):
    if len(data) < 1:
        return False
    document = await symptoms_collection.find_one({"nameStdSymptom": nameStdSymptom})
    if document:
        updated_symptom = await symptoms_collection.update_one(
            {"nameStdSymptom": nameStdSymptom}, {"$set":data}
        )
        if updated_symptom:
            return document
        return False

# Delete an entry
async def remove_symptom(nameStdSymptom: str):
    document = await symptoms_collection.find_one({"nameStdSymptom": nameStdSymptom})
    if document:
        await symptoms_collection.delete_one({"nameStdSymptom": nameStdSymptom})
        return True