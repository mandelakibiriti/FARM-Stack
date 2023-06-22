from fhirpy import AsyncFHIRClient
import json
import asyncio

async def main():
    # Client Instance
    client = AsyncFHIRClient(
        'http://hapi.fhir.org/baseR4'
    )
    # Search Server
    try:
        resources = client.resources('Observation')
        resources = resources.search(status='final').limit(100000)
        search = await resources.fetch()
    except:
        raise Exception

    with open('py_data/code_data.json', 'w') as result_data:
        json.dump(search, result_data)

if __name__ == '__main__':
    loop = asyncio.get_event_loop()
    loop.run_until_complete(main())