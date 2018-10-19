import items.DrumStick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick("Stagg SF34", "Electronic", "Zantec", 10.64, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Stagg SF34", drumStick.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Electronic", drumStick.getType());
    }

    @Test
    public void hasMake(){
        assertEquals("Zantec", drumStick.getMake());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(10.64, drumStick.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(20, drumStick.getSellPrice(), 0.01);
    }
}
