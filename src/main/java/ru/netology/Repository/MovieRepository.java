package ru.netology.Repository;

import ru.netology.Manager.Movie;

public class MovieRepository {
    private Movie[] films = new Movie[0];

    // возвращает массив всех хранящихся в массиве объектов
    public Movie[] findAll() {
        return films;
    }

    // добавляет объект в массив
    public void save(Movie film) {
        Movie[] tmp = new Movie[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Movie findById(int id) {

        for (Movie film : films) {
            if (film.getFilmId() == id) {
                return film;
            }
        }
        return null;
    }

    public void removeById(int id) {
        Movie[] tmp = new Movie[films.length - 1];
        int copyToIndex = 0;
        for (Movie film : films) {
            if (film.getFilmId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        Movie[] tmp = new Movie[0];
        films = tmp;
    }


}
