package instruments;

import enums.SaxophoneType;

public class Saxophone extends Instrument{

    private SaxophoneType saxophoneType;
    private int noOfValves;

    public Saxophone(String name, String type, String material, String color, double buyPrice, double sellPrice,SaxophoneType saxophoneType, int noOfValves){

        super(name, type, material, color, buyPrice, sellPrice);
        this.saxophoneType = saxophoneType;
        this.noOfValves = noOfValves;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public int getNoOfValves() {
        return noOfValves;
    }
}
