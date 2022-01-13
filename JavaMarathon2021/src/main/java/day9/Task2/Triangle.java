    package day9.Task2;

public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double area() {
        //        По формуле Герона
        double p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

}
