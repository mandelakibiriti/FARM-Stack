from fhirclient import client
import fhirclient.models.codesystem as code
import json
import requests

# Client Instance
settings = {
    'app_id': 'my_app',
    'api_base': 'http://hapi.fhir.org/baseR4'
}
smart = client.FHIRClient(settings=settings)
smart.prepare()
print(smart.ready)

# Get resource based on criteria
search = code.CodeSystem.where({'system': 'http://snomed.info/sct'})
bundle = search.perform(smart.server)
result = bundle.as_json()
with open('data.json', 'w') as result_data:
    json.dump(result, result_data)

# Get all resources from FHIR Server
def get_bundle_as_raw_json(api_base, resource_type, url_suffix=None):
    "GET a bundle of resources of a specific type"
    url=f'{api_base}/{resource_type}'
    if url_suffix is not None:
        url+='?'+url_suffix
    print('GET',url)
    return requests.get(url).json()


def resource_bundle_to_file(api_base, resource_type, url_suffix=None):
    json_response = get_bundle_as_raw_json(api_base, resource_type, url_suffix)
    with open(f'client_py_data/{resource_type}_bundle.json','w') as f:
        json.dump(json_response, f, indent=2)


resource_list = [
    'CodeSystem',
    'CarePlan',
    'CareTeam',
    'Condition',
    'List',
    'Medication',
    'Observation',
    'BodyStructure'
    ]
for resource in resource_list:
    resource_bundle_to_file('http://hapi.fhir.org/baseR4',resource,'_include=*')