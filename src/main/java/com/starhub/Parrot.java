package com.starhub;

public class Parrot extends Bird implements FlyingAnimal {

    private String song;

    public Parrot() {
        this.song = super.soundGenerate();
    }

    public Parrot(SoundGenreate animalThatMakesSound) {
        this.song = animalThatMakesSound.soundGenerate();
    }

    public String fly() {
        return "I am flying";
    }

    @Override
    public String soundGenerate() {
        return song;
    }

}
