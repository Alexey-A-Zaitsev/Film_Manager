package ru.netology.Manager;

public class Manager {

    private String[] films = new String[0];
    private int limit;

    public Manager() {
        this.limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

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
