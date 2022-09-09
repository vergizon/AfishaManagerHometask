package ru.netology;

public class AfishaManager {
    private String[] films = new String[0];
    private int limit;

    public AfishaManager(int count) {
        this.limit = count;
    }

    public AfishaManager() {
        this.limit = 10;
    }

    public void add(String film) {
        String[] tmpFilms = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmpFilms[i] = films[i];
        }
        tmpFilms[tmpFilms.length - 1] = film;

        if (tmpFilms.length <= limit) {
            films = tmpFilms;
        }

    }


    public String[] findAll() {
        return films;
    }

    public String[] findLast(int count) {
        int resultLength;
        if (count >= films.length) {
            resultLength = films.length;
        } else {
            resultLength = count;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

}






