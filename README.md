JerseyShore
===========

Jersey REST Service experiment for retrieving information on the Jersey Shore

## Running

Install gradle and from the command-line run:

    > gradle jettyRun

## REST Endpoints

Browsing these endpoints in a browser will return the XML responses since browsers typically send
an Accept header containing `application/xml` but you can also view the JSON responses using any REST client
if you specify `Accept: application/json` as the desired response format.

#### Series Info

    http://localhost:8081/series
    Accept: application/json || application/xml

#### List Seasons

    http://localhost:8081/series/seasons
    Accept: application/json || application/xml

#### Season Info

    http://localhost:8081/series/seasons/{seasonId}
    Accept: application/json || application/xml

#### Season Episode List

    http://localhost:8081/series/seasons/{seasonId}/episodes
    Accept: application/json || application/xml

#### Episode Info

    http://localhost:8081/series/seasons/{seasonId}/episodes/{episodeNumber}
    Accept: application/json || application/xml
