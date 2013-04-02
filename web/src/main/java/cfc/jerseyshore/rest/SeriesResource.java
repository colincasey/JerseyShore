package cfc.jerseyshore.rest;

import cfc.jerseyshore.models.Series;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class SeriesResource {
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Series getSeries() {
        return Series.get();
    }

    @Path("/seasons")
    public SeasonsResource getSeasons() {
        return new SeasonsResource(Series.get());
    }
}
