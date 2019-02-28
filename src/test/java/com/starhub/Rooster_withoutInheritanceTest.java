package com.starhub;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Rooster_withoutInheritanceTest {
	 private Rooster_withoutInheritance rooster_withoutInheritance;

	    public Rooster_withoutInheritanceTest() {
	        this.rooster_withoutInheritance = new Rooster_withoutInheritance();
	    }

	    @Test
	    public void testGeneratedSound() {
	        assertEquals("Cock-a-doodle-doo", rooster_withoutInheritance.generatedSound());
	    }
	    
	   
	    @Test
	    public void generatedSoundToTelegu() {
	        Rooster rooster = new Rooster();

	        assertEquals("cooko ro cooko", DemonstratingSound.translate(rooster.generatedSound(), Language.Telugu));
	    }
	   
	    @Test
	    public void testWalk() {
	        assertEquals("I am walking", rooster_withoutInheritance.walk());
	    }
	  
	
}
