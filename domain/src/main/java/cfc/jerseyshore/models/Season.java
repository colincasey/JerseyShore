package cfc.jerseyshore.models;

import java.util.Date;
import java.util.List;

public class Season {
    private int id;
    private String name;
    private int numberOfEpisodes;
    private Date firstAirDate;
    private Date lastAirDate;
    private List<Episode> episodes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Date getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(Date firstAirDate) {
        this.firstAirDate = firstAirDate;
    }

    public Date getLastAirDate() {
        return lastAirDate;
    }

    public void setLastAirDate(Date lastAirDate) {
        this.lastAirDate = lastAirDate;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public Episode getEpisode(int id) {
        for(Episode episode : getEpisodes()) {
            if(episode.getEpisodeNumber() == id) {
                return episode;
            }
        }
        return null;
    }
}
