package com.example.user.mysteryboxgame;

/**
 * Created by user on 18/07/2017.
 */

public enum Amount {
    ONE(1, "Blue"),
    FIVE(5, "Blue"),
    TEN(10, "Blue"),
    FIFTY(50, "Blue"),
    HUNDRED(100, "Blue"),
    THOUSAND(1000, "Red"),
    FIVETHOUSAND(5000, "Red"),
    TENTHOUSAND(10000, "Red"),
    TWENTYFIVETHOUSAND(25000, "Red"),
    FIFTYTHOUSAND(50000, "Red");

    private String colour;
    private int value;

    Amount(int value, String colour) {
        this.value = value;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }
}
