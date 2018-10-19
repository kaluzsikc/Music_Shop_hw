import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Paper Concept 219560", "Kraft Paper", "Paper Concept", 5.23, 7);
    }

    @Test
    public void hasName(){
        assertEquals("Paper Concept 219560", sheetMusic.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Kraft Paper", sheetMusic.getType());
    }

    @Test
    public void hasMake(){
        assertEquals("Paper Concept", sheetMusic.getMake());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5.23, sheetMusic.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(7, sheetMusic.getSellPrice(), 0.01);
    }
}
