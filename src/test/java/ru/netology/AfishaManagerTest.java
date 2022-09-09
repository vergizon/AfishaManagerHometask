package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @BeforeEach
    public void setup() {
        manager.add("Игра престолов");
        manager.add("Афоня");
        manager.add("Молчание ягнят");
        manager.add("Терминатор");
        manager.add("Любовь и голуби");
        manager.add("Властелин колец");
        manager.add("Джентльмены удачи");
        manager.add("Криминальное чтиво");
        manager.add("Побег из Шоушенка");
        manager.add("Служебный роман");
    }

    @Test
    public void addAllFilmsWithLimit() {

        String[] actual = manager.findAll();
        String[] expected = {"Игра престолов",
                "Афоня",
                "Молчание ягнят",
                "Терминатор",
                "Любовь и голуби",
                "Властелин колец",
                "Джентльмены удачи",
                "Криминальное чтиво",
                "Побег из Шоушенка",
                "Служебный роман"
        };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addAllFilmsWithoutLimit() {
        AfishaManager manager2 = new AfishaManager(5);

        manager2.add("Игра престолов");
        manager2.add("Афоня");
        manager2.add("Молчание ягнят");
        manager2.add("Терминатор");
        manager2.add("Любовь и голуби");

        String[] actual = manager2.findAll();
        String[] expected = {"Игра престолов", "Афоня", "Молчание ягнят", "Терминатор", "Любовь и голуби"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindFiveLastFilms() {

        String[] actual = manager.findLast(5);
        String[] expected = {"Служебный роман", "Побег из Шоушенка", "Криминальное чтиво", "Джентльмены удачи", "Властелин колец"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindTenLastFilms() {

        String[] actual = manager.findLast(10);

        String[] expected = {"Служебный роман", "Побег из Шоушенка", "Криминальное чтиво", "Джентльмены удачи", "Властелин колец", "Любовь и голуби", "Терминатор", "Молчание ягнят", "Афоня", "Игра престолов"};

        Assertions.assertArrayEquals(expected, actual);
    }

}