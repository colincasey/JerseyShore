package cfc.jerseyshore.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DataStore {
    private static Series series;

    public static Series getSeries() {
        if(series == null) {
            series = new DataStore().createSeries();
        }
        return series;
    }

    private DataStore() {
        // empty ctor
    }

    public Series createSeries() {
        return series(
            "Jersey Shore",
            "description...",
            seasons(
                season1(),
                season2(),
                season3(),
                season4(),
                season5(),
                season6()
            )
        );
    }

    private Series series(String title, String description, List<Season> seasons) {
        Series series = new Series();
        series.setTitle(title);
        series.setDescription(description);
        series.setSeasons(seasons);
        return series;
    }

    private List<Season> seasons(Season...seasons) {
        return Arrays.asList(seasons);
    }

    private static Season season1() {
        return season(
            1,
            date(2009, 12, 3),
            date(2010, 1, 21),
            episodes(
                episode(1, 1, "A New Family", 1.38, date(2009, 12, 3)),
                episode(2, 2, "The Tanned Triangle", 1.38, date(2009, 12, 3))
            )
        );
    }

    private static Season season2() {
        return season(
            2,
            date(2010, 7, 29),
            date(2010, 10, 21)
        );
    }

    private static Season season3() {
        return season(
            3,
            date(2011, 1, 6),
            date(2011, 3, 24)
        );
    }

    private static Season season4() {
        return season(
            4,
            date(2011, 8, 4),
            date(2011, 10, 20)
        );
    }

    private static Season season5() {
        return season(
            5,
            date(2012, 1, 5),
            date(2012, 3, 15)
        );
    }

    private static Season season6() {
        return season(
            6,
            date(2012, 10, 4),
            date(2012, 12, 20)
        );
    }

    private static Season season(int id, Date start, Date end) {
        return season(id, start, end, new ArrayList<Episode>());
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

    private static List<Episode> episodes(Episode...episodes) {
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
}
