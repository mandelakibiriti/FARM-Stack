from fastapi import APIRouter, HTTPException
from fhirclient import client
import fhirclient.models.condition as condition

router = APIRouter()

settings = {
    'app_id': 'my_app',
    'api_base': 'https://hapi.fhir.org/baseDstu3'
}
fhir_client = client.FHIRClient(settings=settings)

# https://github.com/smart-on-fhir/client-py/blob/master/flask_app.py
@router.get("/fhir/Patient")
def get_patient():
    condition_data = condition.Condition.read('cb3ca1d2-7b1d-4ec5-8683-e90b4344d0c2',fhir_client.server)
    return condition_data.id