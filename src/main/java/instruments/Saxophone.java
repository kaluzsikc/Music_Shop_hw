package instruments;

import enums.SaxophoneType;

public class Saxophone extends Instrument{

    private SaxophoneType saxophoneType;
    private int noOfValves;

    public Saxophone(String name, String type, String material, String color, String playSound, double buyPrice, double sellPrice,SaxophoneType saxophoneType, int noOfValves){

        super(name, type, material, color, playSound, buyPrice, sellPrice);
        this.saxophoneType = saxophoneType;
        this.noOfValves = noOfValves;
    }

    public SaxophoneType getSaxophoneType() {
        return saxophoneType;
    }

    public int getNoOfValves() {
        return noOfValves;
    }


    @Override
    public String play() {
        return "Saxophone plays: " + getPlaySound();
    }
}
