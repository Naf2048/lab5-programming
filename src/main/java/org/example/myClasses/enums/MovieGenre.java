package org.example.myClasses.enums;

import org.example.exceptions.IllegalValueException;

public enum MovieGenre {
    ACTION("боевик"),
    ADVENTURE("приключение"),
    TRAGEDY("трагедия"),
    THRILLER("триллер"),
    SCIENCE_FICTION("научная фантастика");

    public final String ruName;

    MovieGenre(String movieGenreRuName) {
        ruName = movieGenreRuName;
    }

    public String getRuName() {
        return this.ruName;
    }

    public static MovieGenre getGenre(String mGenre) {
        for (MovieGenre val : MovieGenre.values()) {
            if (val.getRuName().equalsIgnoreCase(mGenre)) {
                return val;
            }
        }
        throw new IllegalValueException("такой константы не существует");//проверка константы
    }

    public boolean findGenreValue(MovieGenre mGenre) {
        for (MovieGenre val : MovieGenre.values()) {
            if (val.getRuName().equalsIgnoreCase(mGenre.getRuName())) {
                return true;
            }
        }
        return false;
    }
}