package com.example.user.mysteryboxgame;

import java.util.ArrayList;

/**
 * Created by user on 23/07/2017.
 */

public class Banker {

    private int offer;

    public Banker() {
        this.offer = 0;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    public void makeOffer(ArrayList<Box> boxes, int startingBoxes){
        int liveBoxes = boxes.size();
        int totalPrizes = 0;
        ArrayList<int> livePrizes = new ArrayList<>();
        for (Box box : boxes){
            totalPrizes += box.getPrize();
            livePrizes.add(box.getPrize());
        }
        if (livePrizes.contains(250000) && liveBoxes == 2){}





    }
}
