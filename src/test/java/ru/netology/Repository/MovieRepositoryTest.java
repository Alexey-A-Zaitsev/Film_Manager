package ru.netology.Repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Manager.Movie;

public class MovieRepositoryTest {

    MovieRepository repo = new MovieRepository();

    Movie movie1 = new Movie(10, "First Film", "\n" +
            "action movie", false);
    Movie movie2 = new Movie(14, "Second Film", "\n" +
            "comedy", true);
    Movie movie3 = new Movie(67, "Third Film", "\n" +
            "drama", false);
    Movie movie4 = new Movie(105, "Fourth  Film", "\n" +
            "cartoon", true);


    @Test
    public void shouldAddFilmIfNotEmpty() {
        repo.save(movie1);
        repo.save(movie3);

        repo.save(movie4);
        repo.save(movie2);


        Movie[] expected = {movie1, movie3, movie4, movie2};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldFindById() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);


        Movie expected = movie4;
        Movie actual = repo.findById(105);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldGiveNullIfIdDoNotExist() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        Movie expected = null;
        Movie actual = repo.findById(235);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        repo.removeById(movie2.getFilmId());

        Movie[] expected = {movie1, movie3, movie4};
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        repo.save(movie1);
        repo.save(movie2);
        repo.save(movie3);
        repo.save(movie4);

        repo.removeAll();
        Movie[] expected = new Movie[0];
        Movie[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

}
