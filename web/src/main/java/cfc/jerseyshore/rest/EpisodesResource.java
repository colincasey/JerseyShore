package cfc.jerseyshore.rest;

import cfc.jerseyshore.models.Episode;
import cfc.jerseyshore.models.Season;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class EpisodesResource {
    private int seasonId;

    public EpisodesResource(int seasonId) {
        this.seasonId = seasonId;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON })
    public List<Episode> getEpisodes() {
        return Season.get(seasonId).getEpisodes();
    }
}
