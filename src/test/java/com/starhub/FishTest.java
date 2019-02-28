package com.starhub;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FishTest {

    private Fish fish;

    public FishTest() {
        this.fish = new Fish();
    }

    @Test
    public void testSwim() {
        assertEquals("I am swimming", fish.swim());
    }
}