package ru.romanov.task.pages.statistics.model;

import java.net.URL;
import java.util.List;

public record Statistics(
        List<URL> disappearedPages,
        List<URL> appearedPages,
        List<URL> changedPages
) {
}
