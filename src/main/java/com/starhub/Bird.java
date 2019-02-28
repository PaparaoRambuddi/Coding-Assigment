package com.starhub;

public class Bird implements WalkingAnimal, SoundGenreate {

    public String walk() {
        return "I am walking";
    }

    public String soundGenerate() {
        return "I am singing";
    }
    
    //no  methods for Fly and swim as these are not common in Duck and Chicken.
}