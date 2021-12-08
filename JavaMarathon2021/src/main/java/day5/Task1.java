package day5;

public class Task1 {
    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.setModel("Toyota");
        newCar.setColor("Red");
        newCar.setYearManufactory(2021);
        System.out.println(newCar.getModel());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getYearManufactory());
    }
}

