package day7;

public class Airplane {
    private String producer;
    private int year;
    private float length;
    private float weigth;
    private float fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Airplane(String producer, int year, float length, float weigth) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        this.fuel = 0;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public float getFuel() {
        return fuel;
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public float getLength(){
        return this.length;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weigth=" + weigth +
                ", fuel=" + fuel +
                '}';
    }

    public void info() {
        System.out.println(String.format("Изготовитель: %s, год выпуска: %s, длина: %s, " +
                "вес: %s, количество топлива в баке: %s",
                this.producer, this.year, this.length, this.weigth, this.fuel));
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.getLength()>airplane2.getLength()) {
            System.out.println(String.format("Самолет %s оказался длиннее ", airplane1.toString()));
        }else if(airplane1.getLength()<airplane2.getLength()){
            System.out.println(String.format("Самолет %s оказался длиннее ", airplane2.toString()));
        }
    }

}
