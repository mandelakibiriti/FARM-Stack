from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from motor.motor_asyncio import AsyncIOMotorClient
from .config import Settings as settings
from ..api.v1.endpoints import api
from ..repositories import db

app = FastAPI()
mongodb_client = AsyncIOMotorClient(settings.DB_URI)

origins = ['http://localhost:3000'] 
app.add_middleware(
    CORSMiddleware,
    allow_origins = origins,
    allow_credentials = True,
    allow_methods = ['*'],
    allow_headers = ['*']
)

@app.on_event("startup")
async def startup_db_client():
    mongodb_client[settings.DB_NAME]

@app.on_event("shutdown")
async def shutdown_db_client():
    mongodb_client.close()

app.include_router(api.router)
app.include_router(db.router)

# TODO: Access Fhir resources on open source hapi server
# https://github.com/smart-on-fhir/client-py/blob/master/flask_app.py
# app.include_router(fhir.router)