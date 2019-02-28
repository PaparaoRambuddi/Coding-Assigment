package com.starhub;

public class DemonstratingSound {

    public static String translate(String sound, Language translateTo) {

        switch (translateTo) {
        case Telugu:
            return "cooko ro cooko";    
        case Danish:
                return "kykyliky";
            case Dutch:
                return "kukeleku";
            case Finnish:
                return "kukko kiekuu";
            case French:
                return "cocorico";
            case German:
                return "kikeriki";
            case Greek:
                return "kikiriki";
            case Hebrew:
                return "coo-koo-ri-koo";
            case Hungarian:
                return "kukuriku";
            case Italian:
                return "chicchirichi";
            case Japanese:
                return "ko-ke-kok-ko-o";
            case Portuguese:
                return "cucurucu";
            case Russian:
                return "kukareku";
            case Swedish:
                return "kuckeliku";
            case Turkish:
                return "kuk-kurri-kuuu";
            case Urdu:
                return "kuklooku";
            default:
                System.out.println("Unable to translate to: " + translateTo +"Plese helpt choose Danish  Danish\"Dutch\"Finnish\"French\"German\"Greek\"Hebrew\"Hungarian\"Italian\"Japanese\"Portuguese\"Russian\"Swedish\"Turkish\"Urdu Laungauge"); // if input is not matching to the fields.
                return sound;
        }
    }

}
