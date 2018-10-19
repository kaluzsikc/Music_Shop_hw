import enums.GuitarType;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Yamaha500", "String", "Mahogany", "red", 100.00, 200.00, GuitarType.Acoustic, 12);
    }

    @Test
    public void hasName(){
        assertEquals("Yamaha500", guitar.getName());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("red", guitar.getColor());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, guitar.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.Acoustic, guitar.getGuitarType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(12, guitar.getNoOfStrings());
    }


}
