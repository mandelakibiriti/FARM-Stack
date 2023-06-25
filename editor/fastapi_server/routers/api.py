from fastapi import APIRouter, HTTPException

router = APIRouter()

from ..database import (
    fetch_all_dx,
    fetch_one_dx_by_id,
    fetch_one_dx_by_nameStd,
    fetch_all_symptom,
    fetch_one_symptom
)

from ..schemas import Diagnosis, Symptom

#-------------------------------------------------------------------------------------
# DIAGNOSES
#-------------------------------------------------------------------------------------

@router.get("/")
def root():
    return{"message: its alive..."}

@router.get("/api/dx")
async def get_all_dx():
    response = await fetch_all_dx()
    return response

@router.get("/api/dx/{id}", response_model=Diagnosis)
async def get_dx_by_id(id):
    response = await fetch_one_dx_by_id(id)
    if response:
        return response
    raise HTTPException(404, f"Error! No diagnosis found with that ID")

@router.get("/api/dx/name/{nameStd}", response_model=Diagnosis)
async def get_dx_by_nameStd(nameStd):
    print(nameStd)
    response = await fetch_one_dx_by_nameStd(nameStd)
    if response:
        return response
    raise HTTPException(404, f"Error no nameStd in database with the name: {nameStd}")

#-------------------------------------------------------------------------------------
# SYMPTOMS
#-------------------------------------------------------------------------------------
@router.get("/api/symptom")
async def get_all_symptom():
    response = await fetch_all_symptom()
    return response

@router.get("/api/symptom/{nameStdSymptom}", response_model=Symptom)
async def get_symptom_by_nameStdSymptom(nameStdSymptom):
    response = await fetch_one_symptom(nameStdSymptom)
    if response:
        return response
    raise HTTPException(404, f"Error with no nameStdSymptom in database with {nameStdSymptom}")