package instruments;

public abstract class Instrument {
    private String material;
    private String color;
    private String type;

    public Instrument(String material, String color, String type){
        this.material = material;
        this.color = color;
        this.type = type;
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
}
