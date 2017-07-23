package com.example.user.mysteryboxgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 18/07/2017.
 */

public class MysteryBoxGame {
    ArrayList<Box> boxes;

    public MysteryBoxGame() {
        this.boxes = new ArrayList<Box>();
    }

    public int countBoxes() {
        return boxes.size();
    }

    public void begin() {
        List<Amount> amounts = Arrays.asList(Amount.values());
        Collections.shuffle(amounts);

        for (int i = 0; i < Amount.values().length; i++) {
            Box box = new Box(i + 1, amounts.get(i));
            this.boxes.add(box);
        }
    }

    public Box pickBox(int pick){
        Box choice = boxes.get(pick -1);
        boxes.remove(pick - 1);
        return choice;
    }

}


