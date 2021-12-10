package day6;

public class Car {
    private String model;
    private String color;
    private int yearManufactory;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufactory() {
        return yearManufactory;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearManufactory(int yearManufactory) {
        this.yearManufactory = yearManufactory;
    }

    public void info(int year) {
        System.out.println(String.format("Это автомобиль, %s", Math.abs(year-this.yearManufactory)));
    }
}