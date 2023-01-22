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
