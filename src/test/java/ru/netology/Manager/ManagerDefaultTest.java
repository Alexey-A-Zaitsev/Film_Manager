// Тесты для значения количества фильмов по умолчанию (10)

package ru.netology.Manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerDefaultTest {
    Manager manager = new Manager();

    @Test
    public void shouldAddOneFilm() {
        manager.addNewFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Добавление 5 фильмов + Вывод всех фильмов в порядке добавления
    @Test
    public void shouldAddFiveFilms() {
        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод последних добавленных фильмов в обратном порядке
    @Test
    public void shouldFindLastFilmsIfLessFilmsThanLimit() {
        manager.addNewFilm("Film 1");
        manager.addNewFilm("Film 2");
        manager.addNewFilm("Film 3");
        manager.addNewFilm("Film 4");
        manager.addNewFilm("Film 5");
        manager.addNewFilm("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    //
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
        manager.addNewFilm("Film 9");
        manager.addNewFilm("Film 10");
        manager.addNewFilm("Film 11");
        manager.addNewFilm("Film 12");


        String[] expected = {"Film 12", "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
