## EHRBase

- The EHRBase Server is an open-source implementation of the open EHR specifications. It provides a backend database for storing clinical data and a REST API for accessing and manipulating the data. Ehr Base is useful in building open EHR-based applications or integrating open EHR into existing systems.

- Together, these components form the open EHR ecosystem, which promotes interoperability, standardization, and knowledge sharing in the domain of electronic health records and clinical information management.

### Guidance Docs
- Navigate to [EhrBase Docs](https://ehrbase.readthedocs.io/en/latest/03_development/04_docker_images/index.html) to view the setup documentation using Docker.

### 1. Build EHRBase Image on Docker
- Run the below commands to download the EHRBase docker files and create a docker image of EHRBase Server and EHRBase - Postgres Database.
```bash
git clone https://github.com/ehrbase/docker.git
cd docker/dockerfiles
docker build -t ehrbase_db -f ehrbase-postgresql-full.dockerfile .
docker image ls
```

### 2. Docker-compose.yml file configuration
- The [docker-compose.yml file](./docker/docker-compose.yml) will have the configurations of the EHRBase server and its connection to the EHRBase - Postgres DB.

### 3. Docker Compose
- Run the docker command below to run the EHRBase Server and DB
```bash
docker-compose up
```
### 4. Confirm EHRBase Container is running
For newly implemented EHRBase Server and DB confirm the container is running.
```bash
docker ps

CONTAINER ID   IMAGE                    COMMAND                  CREATED      STATUS          PORTS                    NAMES
8785f9e20d02   ehrbase/ehrbase:0.27.4   "/bin/sh -c ./docker…"   3 days ago   Up 17 minutes   0.0.0.0:8080->8080/tcp   docker-ehrbase-1
8365f2234bc8   ehrbase_db               "docker-entrypoint.s…"   3 days ago   Up 17 minutes   0.0.0.0:5432->5432/tcp   docker-ehrdb-1
```
In case you have the container already locally for EHRBase Server and EHRBase - Postgres DB implemented run:
```bash
docker start ehrserver-id ehrdb-id
```
Follow this [link](https://scribehow.com/page/FHIR__OpenEHR_Implementation__VOFdemXsQvin_U3XZ52D6g) how to use the openEHR REST APIs to post, create compositions and manipulate the posted templates to get canonical formats of your choice in JSON and XML.