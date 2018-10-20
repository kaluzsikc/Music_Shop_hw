import enums.SaxophoneType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

   Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Adolphe Sax ", "Woodwind", "Brass", "Gold", "Taaaada",200.00, 400.00, SaxophoneType.Alto, 5);
    }

    @Test
    public void hasName(){
        assertEquals("Adolphe Sax ", saxophone.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Woodwind", saxophone.getType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Gold", saxophone.getColor());
    }

    @Test
    public void playsSound() { assertEquals("Taaaada", saxophone.getPlaySound());}

    @Test
    public void hasBuyPrice(){
        assertEquals(200.00, saxophone.getBuyPrice(),0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(400.00, saxophone.getSellPrice(), 0.01);
    }

    @Test
    public void hasPianoType(){
        assertEquals(SaxophoneType.Alto, saxophone.getSaxophoneType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(5, saxophone.getNoOfValves());
    }

    @Test
    public void canPlay(){ assertEquals("Saxophone plays: Taaaada", saxophone.play());}

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, saxophone.calculateMarkup(),0.01);
    }
}
