package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        while (cont<5) {
            cont = cont + 1;
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a/b);
        }
    }
}
