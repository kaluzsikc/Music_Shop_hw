package instruments;

public abstract class Instrument {
    private String name;
    private String material;
    private String color;
    private String type;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String name, String type, String material, String color, double buyPrice, double sellPrice){
        this.name = name;
        this.material = material;
        this.color = color;
        this.type = type;
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

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
