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
        AfishaManager manager3 = new AfishaManager(5);

        manager3.add("Служебный роман");
        manager3.add("Побег из Шоушенка");
        manager3.add("Криминальное чтиво");
        manager3.add("Джентльмены удачи");
        manager3.add("Властелин колец");

        String[] actual = manager3.findLast();
        String[] expected = {"Властелин колец", "Джентльмены удачи", "Криминальное чтиво", "Побег из Шоушенка", "Служебный роман"};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void FindTenLastFilms() {
        AfishaManager manager4 = new AfishaManager(10);

        manager4.add("Игра престолов");
        manager4.add("Афоня");
        manager4.add("Молчание ягнят");
        manager4.add("Терминатор");
        manager4.add("Любовь и голуби");
        manager4.add("Властелин колец");
        manager4.add("Джентльмены удачи");
        manager4.add("Криминальное чтиво");
        manager4.add("Побег из Шоушенка");
        manager4.add("Служебный роман");


        String[] actual = manager4.findLast();

        String[] expected = {"Служебный роман", "Побег из Шоушенка", "Криминальное чтиво", "Джентльмены удачи", "Властелин колец", "Любовь и голуби", "Терминатор", "Молчание ягнят", "Афоня", "Игра престолов"};

        Assertions.assertArrayEquals(expected, actual);
    }

}