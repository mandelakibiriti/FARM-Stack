from dotenv import load_dotenv
from os import path, environ

# Base folder dir path
base_dir = path.abspath(path.dirname(__file__))
load_dotenv(path.join(base_dir,'.env'))

class Settings():
    app_name = "fastapi_mongo_app"
    DB_URI = environ.get('DATABASE_URI')
    DB_PORT = environ.get('DATABASE_PORT')
    DB_NAME = environ.get('DATABASE_NAME')