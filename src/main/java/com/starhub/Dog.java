package com.starhub;

public class Dog implements WalkingAnimal, SoundGenreate {

    public String walk() {
        return "I am walking";
    }

    public String soundGenerate() {
        return "Woof, woof";
    }
}
