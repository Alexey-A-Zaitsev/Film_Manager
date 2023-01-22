package ru.netology.Manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.Repository.MovieRepository;

import static org.mockito.Mockito.*;

public class MockitoFilmManagerTest {

    MovieRepository repo = Mockito.mock(MovieRepository.class);
    FilmManager manager = new FilmManager(repo);

    Movie movie1 = new Movie(10, "First Film", "\n" +
            "action movie", false);
    Movie movie2 = new Movie(14, "Second Film", "\n" +
            "comedy", true);
    Movie movie3 = new Movie(67, "Third Film", "\n" +
            "drama", false);
    Movie movie4 = new Movie(105, "Fourth  Film", "\n" +
            "cartoon", true);
    Movie movie5 = new Movie(105, "Fifth  Film", "\n" +
            "comedy", false);
    Movie movie6 = new Movie(105, "Sixth  Film", "\n" +
            "action", false);
    Movie movie7 = new Movie(105, "Seventh  Film", "\n" +
            "cartoon", false);
    Movie movie8 = new Movie(105, "Eighth  Film", "\n" +
            "cartoon", true);
    Movie movie9 = new Movie(105, "Ninth  Film", "\n" +
            "action", true);
    Movie movie10 = new Movie(105, "Tenth  Film", "\n" +
            "cartoon", false);
    Movie movie11 = new Movie(105, "Eleventh  Film", "\n" +
            "comedy", true);
    Movie movie12 = new Movie(105, "Twelfth  Film", "\n" +
            "action", false);

    @Test
    public void shouldGiveAddedFilms() {
        Movie[] film = {movie1, movie2, movie3, movie4};
        doReturn(film).when(repo).findAll();

        Movie[] expected = {movie1, movie2, movie3, movie4};
        Movie[] actual = manager.allFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreFilmsThanLimit() {
        // Задаём лимит вывода
        manager.setLimit(6);
        Movie[] film = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12};
        doReturn(film).when(repo).findAll();


        Movie[] expected = {movie12, movie11, movie10, movie9, movie8, movie7};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessFilmsThanLimit() {
        Movie[] film = {movie1, movie2, movie3, movie4, movie5};
        doReturn(film).when(repo).findAll();


        Movie[] expected = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
