package com.starhub;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuckTest {

    private Duck duck;

    public DuckTest() {
        this.duck = new Duck();
    }

    @Test
    public void testSing() {
        assertEquals("Quack, quack", duck.soundGenerate());
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", duck.swim());
    }
}