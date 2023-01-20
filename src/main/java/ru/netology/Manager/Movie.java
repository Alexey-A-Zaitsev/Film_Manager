package ru.netology.Manager;

public class Movie {

    private int filmId;
    private String movieTitle;
    private String filmGenre;
    private boolean premiereTomorrow;

    public Movie(int filmId, String movieTitle, String filmGenre, boolean premiereTomorrow) {
        this.filmId = filmId;
        this.movieTitle = movieTitle;
        this.filmGenre = filmGenre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}
/*

    // Добавление нового фильма
    public void addNewFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    // Вывод всех фильмов в порядке добавления
    public String[] findAll() {
        return films;
    }

    // Вывод максимального лимита
    public String[] findLast() {
        int managerLimit;
        if (films.length < limit) {
            managerLimit = films.length;
        } else {
            managerLimit = limit;
        }
        String[] tmp = new String[managerLimit];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }

}
*/

