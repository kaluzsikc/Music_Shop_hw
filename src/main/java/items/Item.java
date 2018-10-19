package items;

public abstract class Item {

    private String name;
    private String type;
    private String make;
    private double buyPrice;
    private double sellPrice;

    public Item(String name, String type, String make, double buyPrice, double sellPrice){
        this.name = name;
        this.type = type;
        this.make = make;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
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
