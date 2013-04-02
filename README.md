JerseyShore
===========

Jersey REST Service experiment for retrieving information on the Jersey Shore

## Running

Install gradle and from the command-line run:

    > gradle jettyRun

## REST Endpoints

#### Series Info

    http://localhost:8081/
    Accept: application/json or application/xml

#### List Seasons

    http://localhost:8081/seasons
    Accept: application/json

#### Season Info

    http://localhost:8081/seasons/{seasonId}
    Accept: application/json

#### Season Episode List

    http://localhost:8081/seasons/{seasonId}/episodes
    Accept: application/json
