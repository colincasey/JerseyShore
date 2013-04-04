package cfc.jerseyshore.rest;

import cfc.jerseyshore.models.DataStore;
import cfc.jerseyshore.models.Series;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/series")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Api(value = "/series", description = "More information than one should actually desire about the Jersey Shore")
public class SeriesResource {
    @GET
    @ApiOperation(value = "Details on the whole series", responseClass = "cfc.jerseyshore.models.Series")
    public Series getSeries() {
        return DataStore.getSeries();
    }

    @Path("/seasons")
    public SeasonsResource getSeasons() {
        return new SeasonsResource(DataStore.getSeries());
    }
}
