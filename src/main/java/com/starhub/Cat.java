package com.starhub;

public class Cat implements WalkingAnimal, SoundGenreate{
    public String walk() {
        return "I am walking";
    }

    public String soundGenerate() {
        return "Meow";
    }
}
