package instruments;

import enums.GuitarType;

public class Guitar extends Instrument{

    private GuitarType guitarType;
    private int noOfStrings;

    public Guitar(String name, String type, String material, String color,  double buyPrice, double sellPrice, GuitarType guitarType, int noOfStrings){
        super(name, type, material, color, buyPrice, sellPrice);
        this.guitarType = guitarType;
        this.noOfStrings = noOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }
}
