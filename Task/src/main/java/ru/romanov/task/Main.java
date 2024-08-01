package ru.romanov.task;

import org.jsoup.Jsoup;
import ru.romanov.task.pages.PagesMap;
import ru.romanov.task.pages.statistics.StatisticsManager;
import ru.romanov.task.pages.statistics.writer.HumanReadableWriter;
import javax.xml.parsers.ParserConfigurationException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException, ParserConfigurationException {
        PagesMap pagesMap = new PagesMap();
        var html1 = Jsoup.parse("");
        var html2 = Jsoup.parse("hello");
        var url = new URI("https://www.google.com/").toURL();

        pagesMap.getTodayPages().put(url, html1);
        pagesMap.getYesterdayPages().put(url, html2);
        pagesMap.getTodayPages().put(new URI("https://duckduckgo.com").toURL(), html1);
        pagesMap.getYesterdayPages().put(new URI("https://www.youtube.com").toURL(), html1);

        System.out.println(new StatisticsManager(
                pagesMap, new HumanReadableWriter("Test Name")).getStatistics()
        );
    }
}