package ru.romanov.task.pages.statistics.writer;

import ru.romanov.task.pages.statistics.model.Statistics;
import ru.romanov.task.pages.statistics.StatisticsWriter;

public class HumanReadableWriter implements StatisticsWriter {
    public HumanReadableWriter(String name) {
        this.name = name;
    }

    @Override
    public String write(Statistics statistics) {
        return "Здравствуйте, дорогая "
                + name
                + "\n\n"
                + "За последние сутки во вверенных Вам сайтах произошли следующие изменения:\n"
                + "\n"
                + "Исчезли следующие страницы: "
                + statistics.disappearedPages()
                + "\nПоявились следующие новые страницы "
                + statistics.appearedPages()
                + "\nИзменились следующие страницы "
                + statistics.changedPages()
                + "\n\n"
                + "С уважением,\n"
                + "автоматизированная система\n"
                + "мониторинга.";
    }

    private final String name;
}
