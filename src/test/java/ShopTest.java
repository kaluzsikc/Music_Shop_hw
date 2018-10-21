import enums.GuitarType;
import instruments.Guitar;
import instruments.Instrument;
import items.DrumStick;
import items.Item;
import musicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Instrument guitar;
    Item drumStick;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("Yamaha500", "String", "Mahogany", "red", "Draaaam", 100.00, 200.00, GuitarType.Acoustic, 12);
        drumStick = new DrumStick("Stagg SF34", "Electronic", "Zantec", 10.00, 15);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void stockIsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        shop.addToStock(drumStick);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(guitar);
        shop.addToStock(drumStick);
        assertEquals(2, shop.getStock().size());
        shop.removeFromStock(drumStick);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canGetStockCount(){
        shop.addToStock(guitar);
        shop.addToStock(drumStick);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public void canGetTotalProfit(){
        shop.addToStock(guitar);
        shop.addToStock(guitar);
        shop.addToStock(drumStick);
        assertEquals(3, shop.getStockCount());
        assertEquals(250, shop.getProfit());
    }


}
