package org.example.myClasses.enums;

public enum MpaaRating {
    G("0+"),
    PG("13+"),
    R("16+"),
    NC_17("18+");

    public final String ageRestriction;

    MpaaRating(String movieGenreRuName) {
        ageRestriction = movieGenreRuName;
    }

    public String getAgeRestriction() {
        return this.ageRestriction;
    }
}
