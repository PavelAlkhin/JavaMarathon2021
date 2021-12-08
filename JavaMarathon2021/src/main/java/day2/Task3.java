package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
            return;
        }

        while (a <= b) {
            int mod5 = a % 5;
            int mod10 = a % 10;
            if (mod5 == 0 && mod10 != 0) {
                System.out.print(a);
                System.out.print(" ");

            }
            a = a + 1;
        }
    }
}
