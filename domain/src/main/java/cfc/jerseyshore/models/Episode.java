package cfc.jerseyshore.models;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Episode {
    public static List<Episode> season1() {
        return episodes(
            episode(1, 1, "A New Family", 1.38, date(2009, 12, 3)),
            episode(2, 2, "The Tanned Triangle", 1.38, date(2009, 12, 3))
        );
    }

    private static List<Episode> episodes(Episode... episodes) {
        return Arrays.asList(episodes);
    }

    private static Episode episode(int episodeNumber, int seasonEpisodeNumber, String title, double viewers, Date airDate) {
        Episode episode = new Episode();
        episode.setEpisodeNumber(episodeNumber);
        episode.setSeasonEpisodeNumber(seasonEpisodeNumber);
        episode.setTitle(title);
        episode.setViewers(viewers);
        episode.setAirDate(airDate);
        return episode;
    }

    private static Date date(int year, int month, int day) {
        return new Date(year - 1900, month - 1, day);
    }

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
