# syntax=docker/dockerfile:1
FROM --platform=$BUILDPLATFORM postgres:13.4-alpine
ARG TARGETPLATFORM
ARG BUILDPLATFORM
RUN echo "Running on $BUILDPLATFORM, building EHRbase PostgreSQL DB for $TARGETPLATFORM" > /log

# SHOW POSTGRES SERVER AND CLIENT VERSION
RUN postgres -V; \
    psql -V

# SET DEFAULT VALUES FOR DATABASE USER AND PASSWORDS
ARG EHRBASE_USER="ehrbase_restricted"
ARG EHRBASE_PASSWORD="ehrbase_restricted"
ARG EHRBASE_USER_ADMIN="ehrbase"
ARG EHRBASE_PASSWORD_ADMIN="ehrbase"
ENV EHRBASE_USER_ADMIN=${EHRBASE_USER_ADMIN}
ENV EHRBASE_PASSWORD_ADMIN=${EHRBASE_PASSWORD_ADMIN}
ENV EHRBASE_USER=${EHRBASE_USER}
ENV EHRBASE_PASSWORD=${EHRBASE_PASSWORD}

# COPY DB SETUP SCRIPT TO POSTGRES's DEFAULT DOCKER ENTRYPOINT FOLDER
# NOTE: check postgres's docker docs for details
#       https://hub.docker.com/_/postgres/
COPY scripts/db-setup.sql /docker-entrypoint-initdb.d/
