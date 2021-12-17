package day6;

public class Motorcycle {
    private String model;
    private String color;
    private int yearManufactory;

    public Motorcycle(String model, String color, int yearManufactory) {
        this.model = model;
        this.color = color;
        this.yearManufactory = yearManufactory;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufactory() {
        return yearManufactory;
    }

    public void info(int year) {
        System.out.println(String.format("Это мотоцикл, %s", Math.abs(year-this.yearManufactory)));
    }

}
