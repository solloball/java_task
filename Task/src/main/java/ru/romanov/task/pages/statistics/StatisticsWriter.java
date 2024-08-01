package ru.romanov.task.pages.statistics;

import ru.romanov.task.pages.statistics.model.Statistics;

public interface StatisticsWriter {
    String write(Statistics statistics);
}
