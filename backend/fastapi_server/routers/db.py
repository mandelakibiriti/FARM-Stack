from fastapi import APIRouter, HTTPException, Body
from fastapi.encoders import jsonable_encoder

router  = APIRouter()

from ..database import (
    add_dx, 
    update_dx,
    remove_dx,
    add_symptom,
    change_symptom,
    remove_symptom
)

from ..schemas import (
    Diagnosis,
    UpdateDiagnosis,
    Symptom,
    UpdateSymptom
)

#-------------------------------------------------------------------------------------
# DIAGNOSES
#-------------------------------------------------------------------------------------

@router.post("/api/dx", response_model=Diagnosis, response_description="create a new diagnosis")
async def create_dx(dx:Diagnosis = Body(...)):
    diagnosis = jsonable_encoder(dx)
    response = await add_dx(diagnosis)
    if response:
        return response
    raise HTTPException(400, "Something went wrong / Bad request")

@router.put("/api/dx/{nameStd}", response_model=Diagnosis, response_description="updating an existing diagnosis")
async def update_diagnosis(nameStd: str, req: UpdateDiagnosis = Body(...)):
    req = {k:v for k,v in req.dict().items() if v is not None}
    update_dx_data = await update_dx(nameStd,req)
    if update_dx_data:
        return update_dx_data
    raise HTTPException(404, f"Error occurred when updating diagnosis data")

@router.delete("/api/dx/{nameStd}", response_description="deleting an exisiting diagnosis")
async def delete_dx(nameStd):
    response = await remove_dx(nameStd)
    if response:
        return f"Successfully deleted {nameStd}"
    raise HTTPException(404, f"Error with no nameStd in database with {nameStd}")

#-------------------------------------------------------------------------------------
# SYMPTOMS
#-------------------------------------------------------------------------------------
@router.post("/api/symptom", response_model=Symptom, response_description="create a new symptom")
async def create_symptom(symptom:Symptom = Body(...)):
    symptom = jsonable_encoder(symptom)
    response = await add_symptom(symptom)
    if response:
        return response
    raise HTTPException(400, "Something went wrong / Bad request")

@router.put("/api/symptom/{nameStdSymptom}", response_model=Symptom, response_description="updating an existing symptom")
async def update_symptom(nameStdSymptom: str, req: UpdateSymptom = Body(...)):
    req = {k:v for k,v in req.dict().items() if v is not None}
    update_symptom_data = await change_symptom(nameStdSymptom,req)
    if update_symptom_data:
        return update_symptom_data
    raise HTTPException(404, f"Error occurred when updating symptom data")

@router.delete("/api/symptom/{nameStdSymptom}", response_description="deleting an exisiting symptom")
async def delete_symptom(nameStdSymptom):
    response = await remove_symptom(nameStdSymptom)
    if response:
        return f"Successfully deleted {nameStdSymptom}"
    raise HTTPException(404, f"Error with no nameStdSymptom in database with {nameStdSymptom}")