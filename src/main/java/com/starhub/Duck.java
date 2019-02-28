package com.starhub;

public class Duck extends Bird implements FlyingAnimal {

    @Override
    public String soundGenerate() {
        return "Quack, quack";
    }

    public String fly() {
        return "I am flying";
    }

    public String swim() {
        return "I am swimming";
    }
}