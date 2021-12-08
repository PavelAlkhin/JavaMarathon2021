package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle newMoto = new Motorcycle("Honda", "Red", 2012);
        System.out.println(newMoto.getModel());
        System.out.println(newMoto.getColor());
        System.out.println(newMoto.getYearManufactory());
    }
}
