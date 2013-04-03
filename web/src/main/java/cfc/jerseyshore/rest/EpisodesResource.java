package cfc.jerseyshore.rest;

import cfc.jerseyshore.models.Episode;
import cfc.jerseyshore.models.Season;
import cfc.jerseyshore.models.Series;
import com.sun.jersey.api.NotFoundException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces({MediaType.APPLICATION_JSON })
public class EpisodesResource {
    private Series series;
    private Season season;

    public EpisodesResource(Series series, Season season) {
        this.series = series;
        this.season = season;
    }

    @GET
    public List<Episode> getEpisodes() {
        return season.getEpisodes();
    }

    @GET
    @Path("{id}")
    public Episode getEpisode(@PathParam("id") int id) {
        Episode episode = season.getEpisode(id);
        if(episode == null) {
            throw new NotFoundException("Episode " + id + " was not found");
        }
        return episode;
    }
}
