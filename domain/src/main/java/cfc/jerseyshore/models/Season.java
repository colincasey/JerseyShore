package cfc.jerseyshore.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Season {
    public static List<Season> all() {
        List<Season> seasons = new ArrayList<Season>();
        seasons.add(season(1, date(2009, 12, 3), date(2010, 1, 21),  Episode.season1()));
        seasons.add(season(2, date(2010, 7, 29), date(2010, 10, 21), Episode.season1()));
        seasons.add(season(3, date(2011, 1, 6),  date(2011, 3, 24),  Episode.season1()));
        seasons.add(season(4, date(2011, 8, 4),  date(2011, 10, 20), Episode.season1()));
        seasons.add(season(5, date(2012, 1, 5),  date(2012, 3, 15),  Episode.season1()));
        seasons.add(season(6, date(2012, 10, 4), date(2012, 12, 20), Episode.season1()));
        return seasons;
    }

    public static Season get(int id) {
        for(Season season : all()) {
            if(season.getId() == id) {
                return season;
            }
        }
        return null;
    }

    private static Season season(int id, Date start, Date end, List<Episode> episodes) {
        Season season = new Season();
        season.setId(id);
        season.setName("Season " + id);
        season.setNumberOfEpisodes(episodes.size());
        season.setFirstAirDate(start);
        season.setLastAirDate(end);
        season.setEpisodes(episodes);
        return season;
    }

    private static Date date(int year, int month, int day) {
        return new Date(year - 1900, month - 1, day);
    }

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
}
