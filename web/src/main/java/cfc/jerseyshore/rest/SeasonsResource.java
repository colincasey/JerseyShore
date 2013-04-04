package cfc.jerseyshore.rest;

import cfc.jerseyshore.models.Season;
import cfc.jerseyshore.models.Series;
import com.sun.jersey.api.NotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class SeasonsResource {
    private Series series;

    public SeasonsResource(Series series) {
        this.series = series;
    }

    @GET
    public List<Season> getSeasons() {
        return series.getSeasons();
    }

    @GET
    @Path("{id}")
    public Season getSeason(@PathParam("id") int id) {
        Season season = series.getSeason(id);
        if(season == null) {
            throw new NotFoundException("Season " + id + " was not found");
        }
        return season;
    }

    @Path("{id}/episodes")
    public EpisodesResource getEpisodes(@PathParam("id") int id) {
        return new EpisodesResource(series, series.getSeason(id));
    }
}
