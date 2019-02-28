package com.starhub;

public class Caterpillar implements WalkingAnimal {

    public String walk() {
        return "I am crawling";
    }

    public Butterfly metamorphize() {
        return new Butterfly();
    }
}
