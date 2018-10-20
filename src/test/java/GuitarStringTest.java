import items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {


    GuitarString guitarString;


    @Before
    public void before(){
        guitarString = new GuitarString("Color Guitar String", "Electronic", "Waxun", 5.50, 11);
    }

    @Test
    public void hasName(){
        assertEquals("Color Guitar String", guitarString.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Electronic", guitarString.getType());
    }

    @Test
    public void hasMake(){
        assertEquals("Waxun", guitarString.getMake());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5.50, guitarString.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(11, guitarString.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, guitarString.calculateMarkup(),0.01);
    }
}