package com.example.user.mysteryboxgame;

/**
 * Created by user on 18/07/2017.
 */

public class Box {
    private int number;
    private Amount prize;

    public Box(int number, Amount prize) {
        this.number = number;
        this.prize = prize;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrize() {
        return prize.getValue() ;
    }

    public String getColour(){
        return prize.getColour();
    }

    public void setPrize(Amount prize) {
        this.prize = prize;
    }
}


