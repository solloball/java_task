package ru.romanov.task.pages.statistics.core;

import org.jsoup.nodes.Document;
import ru.romanov.task.pages.statistics.model.Statistics;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Main logic of making statistics.
 */
public class StatisticsMaker {
    /**
     * Find statistics from to maps.
     *
     * @param today today pages.
     * @param yesterday yesterday pages.
     * @return statistics.
     */
    public static Statistics make(HashMap<URL, Document> today, HashMap<URL, Document> yesterday) {
        List<URL> disappearedPages = difference(yesterday, today);
        List<URL> appearedPages = difference(today, yesterday);
        List<URL> changedPages = today.entrySet()
                .stream()
                .filter(entry -> yesterday.containsKey(entry.getKey())
                        && !entry.getValue().equals(yesterday.get(entry.getKey())))
                .map(Map.Entry::getKey)
                .toList();

        return new Statistics(disappearedPages, appearedPages, changedPages);
    }

    private static List<URL> difference(HashMap<URL, Document> one, HashMap<URL, Document> two) {
        return one.keySet()
            .stream()
            .filter(s -> !two.containsKey(s))
            .toList();
    }
}
