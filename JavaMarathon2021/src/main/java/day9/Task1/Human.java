package day9.Task1;

public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(String.format("Этот человек с именем %s", name));
    }
}
