package musicShop;

import interfaces.ISell;

import java.util.ArrayList;

public class Shop{

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int getStockCount() {
        return this.stock.size();
    }


    public int getProfit() {
        int profit = 0 ;

        for (ISell item: stock) {
            profit += item.calculateMarkup();
        }

        return profit;
    }
}
