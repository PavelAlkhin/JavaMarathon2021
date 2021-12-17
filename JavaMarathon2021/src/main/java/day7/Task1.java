package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AIR inc", 1990, 120, 6000);
        Airplane airplane2 = new Airplane("Boing inc", 1995, 121, 5000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}