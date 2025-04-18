package com.equals.task;

import java.util.Objects;

public class Dvd12 {
    private String title;
    private String genre;
    private int duration;
    private String language;

    void setTitle(String title) {
        this.title = title;
    }

    void setGenre(String genre) {
        this.genre = genre;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    void setLanguage(String language) {
        this.language = language;
    }

    String getTitle() {
        return title;
    }

    String getGenre() {
        return genre;
    }

    int getDuration() {
        return duration;
    }

    String getLanguage() {
        return language;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Dvd12) {
            Dvd12 dvd = (Dvd12) any;
            if (Objects.equals(this.title, dvd.title) &&
                    Objects.equals(this.genre, dvd.genre) &&
                    Objects.equals(this.duration, dvd.duration) &&
                    Objects.equals(this.language, dvd.language)) {
                System.out.println("dvd is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Genre: " + this.genre + ", Duration: " + this.duration + " mins, Language: " + this.language;
    }
}
