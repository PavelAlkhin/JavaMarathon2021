package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AIR inc", 1990, 120, 6000);
        airplane.setYear(1992);
        airplane.setLength(125);
        airplane.fillUp(3000);
        airplane.fillUp(124);
        airplane.info();
    }
}
