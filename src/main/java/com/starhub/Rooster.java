package com.starhub;

public class Rooster extends Chicken {

    public String generatedSound() {
        return "Cock-a-doodle-doo";
    }



    public String generatedSound(Language language) {
        return DemonstratingSound.translate("Cock-a-doodle-doo", language);
    }
}
