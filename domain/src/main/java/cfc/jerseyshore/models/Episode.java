package cfc.jerseyshore.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "episode")
public class Episode {
    private int episodeNumber;
    private int seasonEpisodeNumber;
    private String title;
    private double viewers;
    private Date airDate;

    @XmlElement
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @XmlElement
    public int getSeasonEpisodeNumber() {
        return seasonEpisodeNumber;
    }

    public void setSeasonEpisodeNumber(int seasonEpisodeNumber) {
        this.seasonEpisodeNumber = seasonEpisodeNumber;
    }

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public double getViewers() {
        return viewers;
    }

    public void setViewers(double viewers) {
        this.viewers = viewers;
    }

    @XmlElement
    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }
}
