package com.starhub;

public class Chicken extends Bird {
    @Override
    public String soundGenerate() {
        return "Cluck, cluck";
    }
    //no overried method for Fly and swim for Chicken as chicken can't fly and swim
   /* public String fly() {
        return "I am flying";
    }

    public String swim() {
        return "I am swimming";
    }*/

}