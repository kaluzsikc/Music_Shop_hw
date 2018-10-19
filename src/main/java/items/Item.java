package items;

public abstract class Item {

    private String type;
    private double buyPrice;
    private double sellPrice;

    public Item(String type, double buyPrice, double sellPrice){
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
