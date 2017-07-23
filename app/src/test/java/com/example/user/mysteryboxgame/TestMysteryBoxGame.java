package com.example.user.mysteryboxgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/07/2017.
 */

public class TestMysteryBoxGame {

    MysteryBoxGame game;
    int boxes;
    Box box;

    @Before
    public void setUp(){
        game = new MysteryBoxGame();
        game.begin();
        box = new Box(2, Amount.FIFTYTHOUSAND);
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
        MysteryBoxGame spyGame = Mockito.spy(game);
        Mockito.when(spyGame.pickBox(1)).thenReturn(box);
        assertEquals(2, spyGame.pickBox(1).getNumber());
        assertEquals("Red", spyGame.pickBox(1).getColour());
        assertEquals(50000, spyGame.pickBox(1).getPrize());
    }
}
