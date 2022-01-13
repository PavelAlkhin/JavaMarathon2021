package day15;

public class Shoe {
    private String name;
    int size;
    private int stockBalance;

    public Shoe(String name, int size, int stockBalance) {
        this.name = name;
        this.size = size;
        this.stockBalance = stockBalance;
    }

    public String getName() {
        return name;
    }

    public int getStockBalance() {
        return stockBalance;
    }

    public int getSize() {
        return size;
    }
}
