package com.starhub;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateSoundServiceController {

	@RequestMapping(value = "/generateSound/{translateTo}")
	public String generateSound(@PathVariable("translateTo") String translateTo) {
        switch (translateTo) {
        case "Telugu":
            return "cooko ro cooko";    
        case "Danish":
                return "kykyliky";
          case "Dutch":
                return "kukeleku";
            case "Finnish":
                return "kukko kiekuu";
            case "French":
                return "cocorico";
            case "German":
                return "kikeriki";
            case "Greek":
                return "kikiriki";
            case "Hebrew":
                return "coo-koo-ri-koo";
            case "Hungarian":
                return "kukuriku";
            case "Italian":
                return "chicchirichi";
            case "Japanese":
                return "ko-ke-kok-ko-o";
            case "Portuguese":
                return "cucurucu";
            case "Russian":
                return "kukareku";
            case "Swedish":
                return "kuckeliku";
            case "Turkish":
                return "kuk-kurri-kuuu";
            case "Urdu":
                return "kuklooku";
            default:
                return "Unable to translate to: " + translateTo +"Plese helpt choose Telugu\\ Danish\\ Dutch\\ Finnish\\ French\\ German\\ Greek\\ Hebrew\\ Hungarian\\ Italian\\ Japanese\\ Portuguese\\ Russian\\ Swedish\\ Turkish\\ Urdu Laungauge"; // if input is not matching to the fields.
                
        }
    
	   }
}
