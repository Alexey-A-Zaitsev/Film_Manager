package ru.netology.Repository;

import ru.netology.Manager.Movie;

public class MovieRepository {
    private Movie[] films = new Movie[0];

    // Возвращает массив всех хранящихся в массиве объектов
    public Movie[] findAll() {
        return films;
    }

    // Добавляет объект в массив
    public void save(Movie film) {
        Movie[] tmp = new Movie[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    // Возвращает объект по идентификатору, либо null, если такого объекта нет
    public Movie findById(int id) {

        for (Movie film : films) {
            if (film.getFilmId() == id) {
                return film;
            }
        }
        return null;
    }

    // Удаляет объект по идентификатору
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

    // Полностью вычищает репозиторий
    public void removeAll() {
        Movie[] tmp = new Movie[0];
        films = tmp;
    }
}
