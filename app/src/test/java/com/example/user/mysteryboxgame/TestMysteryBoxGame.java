package com.example.user.mysteryboxgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/07/2017.
 */

public class TestMysteryBoxGame {

    MysteryBoxGame game;
    int boxes;

    @Before
    public void setUp(){
        game = new MysteryBoxGame();
        game.begin();
        boxes = Amount.values().length;
    }

    @Test
    public void gameBegins() throws Exception {
        assertEquals(boxes, game.countBoxes());
    }

    @Test
    public void canPickBox() throws Exception {
        game.pickBox(1);
        int remainingBoxes = (boxes -= 1);
        assertEquals(remainingBoxes, game.countBoxes());
    }

    @Test
    public void returnedBoxHasProperties() throws Exception {
        Box choice = game.pickBox(1);
        assertEquals("", choice.getNumber());
//        assertEquals("", choice.getColour());
//        assertEquals("", choice.getPrize());
    }
}
