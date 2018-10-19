import enums.PianoType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Kawai", "String", "Wood", "White", 500.00, 600.00, PianoType.Spinet, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Kawai", piano.getName());
    }

    @Test
    public void hasType(){
        assertEquals("String", piano.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("White", piano.getColor());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(500.00, piano.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasPianoType(){
        assertEquals(PianoType.Spinet, piano.getPianoType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(100, piano.getNoOfChords());
    }

}
