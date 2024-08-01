package ru.romanov.task.pages.statistics;

import ru.romanov.task.pages.PagesMap;
import ru.romanov.task.pages.statistics.core.StatisticsMaker;

/**
 * Class is response for having access to statistics through special writer.
 */
public class StatisticsManager {
    public StatisticsManager(PagesMap pagesMap) {
        this.pagesMap = pagesMap;
    }

    public StatisticsManager(PagesMap pagesMap, StatisticsWriter writer) {
        this.pagesMap = pagesMap;
        this.writer = writer;
    }

    public void setWriter(StatisticsWriter writer) {
        this.writer = writer;
    }

    /**
     * Return statistics through writer.
     * Writer should not null.
     *
     * @return statistics.
     */
    public String getStatistics() {
        return writer.write(StatisticsMaker.make(
                pagesMap.getTodayPages(), pagesMap.getYesterdayPages()));
    }

    private final PagesMap pagesMap;
    private StatisticsWriter writer;
}
