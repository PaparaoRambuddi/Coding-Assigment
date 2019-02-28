package com.starhub;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SoundTranslatorTest {

    @Test
    public void testRoosterSoundTranslationToTelugu() {
        Rooster rooster = new Rooster();

        assertEquals("kuklooku", DemonstratingSound.translate(rooster.generatedSound(), Language.Telugu));
    }
}