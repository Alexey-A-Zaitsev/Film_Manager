package ru.netology.Manager;

import ru.netology.Repository.MovieRepository;


public class FilmManager {

    private MovieRepository repo;
    private int limit;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public FilmManager(MovieRepository repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public FilmManager(MovieRepository repo) {
        this.repo = repo;
        this.limit = 10;
    }

    // Добавление нового фильма
    public void add(Movie film) {
        repo.save(film);
    }

    // Вывод всех фильмов в порядке добавления
    public Movie[] allFilms() {
        return repo.findAll();
    }

    // Вывод последних добавленных фильмов в обратном порядке
    public Movie[] findLast() {

        int managerLimit;
        if (repo.findAll().length < limit) {
            managerLimit = repo.findAll().length;
        } else {
            managerLimit = limit;
        }

        Movie[] all = repo.findAll();
        Movie[] last = new Movie[managerLimit];
        for (int i = 0; i < last.length; i++) {
            last[i] = all[all.length - 1 - i];
        }
        return last;
    }
}
