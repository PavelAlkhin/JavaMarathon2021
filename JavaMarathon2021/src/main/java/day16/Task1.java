package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "C:" + sep + "Users" + sep + "pvl" + sep + "IdeaProjects" + sep + "JavaMarathon2021" + sep + "JavaMarathon2021" + sep + "test1.txt";
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] strings = new String[0];
            while (scanner.hasNextLine()) {
                String lineFile = scanner.nextLine();
                strings = lineFile.split(" ");
            }
            int[] ints = new int[strings.length];
            double sum = 0;
            for (int i = 0; i < strings.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
                sum = sum + ints[i];
            }
            double res = (sum / strings.length);
            String srt = String.format("%.3f", res);
            System.out.print(res + " --> " + srt);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

