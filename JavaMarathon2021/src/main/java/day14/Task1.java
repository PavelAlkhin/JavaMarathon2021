package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "C:" + sep + "Users" + sep + "pvl" + sep + "IdeaProjects" + sep + "JavaMarathon2021" + sep + "JavaMarathon2021" + sep + "test1.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            return;
        }

        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        if (numbersString.length < 10 || numbersString.length > 10) {
            try {
                throw new ScannerException("Некорректный входной файл");
            }catch (ScannerException e){
                System.out.println("Некорректный входной файл");
                return;
            }
        }

        try {
            int[] numbers = new int[10];
            int counter = 0;
            int sum = 0;
            for (String number : numbersString) {
                int n = Integer.parseInt(number);
                numbers[counter++] = n;
                sum += n;
            }
            System.out.println(sum);

        } catch (Exception e) {
            System.out.println("Некорректный входной файл");

        }

        scanner.close();

    }
}
