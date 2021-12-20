package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "C:" + sep + "Users" + sep + "pvl" + sep + "IdeaProjects" + sep + "JavaMarathon2021" + sep + "JavaMarathon2021" + sep;
        File file1 = new File(path + "test1.txt");
        File file2 = new File(path + "test2.txt");
        craeteFile1(file1);
        craeteFile2(file1, file2);
        printResult(file2);
    }

    public static void craeteFile1(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            Random rnd = new Random();
            for (int i = 1; i < 1001; i++) {
                String str = String.valueOf(rnd.nextInt(1000));
                fileWriter.write(str);
                fileWriter.write("\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void craeteFile2(File fileFrom, File fileTo) {
        try {
            FileWriter fileWriter = new FileWriter(fileTo);
            Scanner scanner = new Scanner(fileFrom);
            String[] strings = new String[0];
            double sum = 0;
            int i = 1;
            int promSum = 0;
            while (scanner.hasNextLine()) {
                String lineFile = scanner.nextLine();
                int line = Integer.parseInt(lineFile);
                sum = sum + line;
                if (i % 20 == 0) {
                    String str = String.valueOf(sum / 20);
                    fileWriter.write(str);
                    fileWriter.write(" ");
                    promSum += sum;
                    sum = 0;
                }
                i++;
            }
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void printResult(File fileFrom) {
        try {
            Scanner scanner = new Scanner(fileFrom);
            String[] strings = null;
            while (scanner.hasNextLine()) {
                String lineFile = scanner.nextLine();
                strings = lineFile.split(" ");
            }
            double[] doubles = new double[strings.length];
            double sum = 0;
            for (int i = 0; i < strings.length; i++) {
                doubles[i] = Double.parseDouble(strings[i]);
                sum = sum + doubles[i];
            }
            int res = (int) (sum);
            System.out.println(res);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}