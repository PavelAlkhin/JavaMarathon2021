package day6;

public class Task1 {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setModel("Toyota");
        newCar.setColor("Red");
        newCar.setYearManufactory(2021);
        System.out.println(newCar.getModel());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getYearManufactory());
        newCar.info(2021);

        Motorcycle newMoto = new Motorcycle("Honda", "Red", 2012);
        System.out.println(newMoto.getModel());
        System.out.println(newMoto.getColor());
        System.out.println(newMoto.getYearManufactory());
        newMoto.info(2021);

    }
}
