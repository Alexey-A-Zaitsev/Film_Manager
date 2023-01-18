// Тесты для заданного лимита фильмов

package ru.netology.Manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager manager = new Manager(5);

    @Test
    public void shouldFindLastFilmsIfMoreFilmsThanLimit() {
        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");
        manager.addNewFilm("Film 7");
        manager.addNewFilm("Film 8");

        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5", "Film 4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFilmsIfLessFilmsThanLimit() {
        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");


        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
