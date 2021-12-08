package day1;

public class Task4 {
    public static void main(String[] args) {
        int i = 1980;
        while (i < 2021) {
            System.out.println(String.format("Олимпиада %s", i));
            i = i + 4;
        }
    }
}
