package ru.romanov.task.pages;

import org.jsoup.nodes.Document;
import java.net.URL;
import java.util.HashMap;

/**
 * Class for storing all pages.
 */
public class PagesMap {

    public PagesMap() {
    }

    public PagesMap(
        HashMap<URL, Document> todayPages,
        HashMap<URL, Document> yesterdayPages
    ) {
        this.todayPages = todayPages;
        this.yesterdayPages = yesterdayPages;
    }

    public HashMap<URL, Document> getTodayPages() {
        return todayPages;
    }

    public void setTodayPages(HashMap<URL, Document> todayPages) {
        this.todayPages = todayPages;
    }

    public HashMap<URL, Document> getYesterdayPages() {
        return yesterdayPages;
    }

    public void setYesterdayPages(HashMap<URL, Document> yesterdayPages) {
        this.yesterdayPages = yesterdayPages;
    }

    private HashMap<URL, Document> todayPages = new HashMap<>();
    private HashMap<URL, Document> yesterdayPages = new HashMap<>();
}
