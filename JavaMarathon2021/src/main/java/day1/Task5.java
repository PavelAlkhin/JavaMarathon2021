package day1;

public class Task5 {
    public static void main(String[] args) {
        int i = 1980;
        for (i = 1980; i < 2021;) {
            System.out.println(String.format("Олимпиада %s", i));
            i = i + 4;
        }
    }
}
