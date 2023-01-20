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


    @Test
    public void shouldGiveAddedFilms() {
        Movie[] film = {movie1, movie2, movie3, movie4};
        doReturn(film).when(repo).findAll();

        Movie[] expected = {movie1, movie2, movie3, movie4};
        Movie[] actual = manager.allFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewFilm() {
        Movie[] film = {movie1, movie2, movie3, movie4};
        doReturn(film).when(repo).findAll();
        manager.add(movie4);

        Movie[] expected = {movie1, movie2, movie3, movie4};
        Movie[] actual = manager.allFilms();

        Assertions.assertArrayEquals(expected, actual);
    }
}
