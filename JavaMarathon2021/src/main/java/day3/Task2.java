package day3;

import java.awt.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();

            if (b == 0)
                break;

            System.out.println(a/b);

        }

    }
}
