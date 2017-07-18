package com.example.user.mysteryboxgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/07/2017.
 */

public class TestBox {

    Box box;

    @Before
    public void setUp(){
        box = new Box(2, Amount.FIFTY);
    }

    @Test
    public void hasNumber() throws Exception {
        assertEquals(2, box.getNumber());
    }

    @Test
    public void hasPrizeValue(){
        assertEquals(50, box.getPrize());
    }

    @Test
    public void boxHasColour() throws Exception {
        assertEquals("Blue", box.getColour());
    }
}
