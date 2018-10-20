package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String name;
    private String material;
    private String color;
    private String type;
    private String playSound;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String name, String type, String material, String color, String playSound, double buyPrice, double sellPrice){
        this.name = name;
        this.material = material;
        this.color = color;
        this.type = type;
        this.playSound = playSound;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getPlaySound() { return playSound; }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play(){ return this.playSound; }

    public double calculateMarkup(){
        return (getSellPrice() - getBuyPrice())/getBuyPrice() * 100;
    }
}
