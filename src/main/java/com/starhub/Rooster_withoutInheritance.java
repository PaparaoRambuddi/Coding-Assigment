package com.starhub;

public class Rooster_withoutInheritance implements Animal {
	
	 public String generatedSound() {
	        return "Cock-a-doodle-doo";
	    }

	  public String generatedSound(Language language) {
	        return DemonstratingSound.translate("Cock-a-doodle-doo", language);
	  }

	  
	  public String soundGenerate() {
	        return "Cock-a-doodle-doo";
	    }
	  
	  public String walk() {
	        return "I am walking";
	    }

	

}
