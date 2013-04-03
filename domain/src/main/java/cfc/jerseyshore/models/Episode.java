package cfc.jerseyshore.models;

import java.util.Date;

public class Episode {
    private int episodeNumber;
    private int seasonEpisodeNumber;
    private String title;
    private double viewers;
    private Date airDate;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public int getSeasonEpisodeNumber() {
        return seasonEpisodeNumber;
    }

    public void setSeasonEpisodeNumber(int seasonEpisodeNumber) {
        this.seasonEpisodeNumber = seasonEpisodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getViewers() {
        return viewers;
    }

    public void setViewers(double viewers) {
        this.viewers = viewers;
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }
}
