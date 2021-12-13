package day9.Task2;

public class Rectangle extends Figure{
    private double weight;
    private double hieght;

    public Rectangle(double weight, double hieght, String color) {
        super(color);
        this.weight = weight;
        this.hieght = hieght;
    }

    public double getWeight() {
        return weight;
    }

    public double getHieght() {
        return hieght;
    }

    @Override
    public double area() {
        return weight*hieght;
    }

    @Override
    public double perimeter() {
        return (weight + hieght)*2;
    }
}
