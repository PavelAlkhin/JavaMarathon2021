package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");
        try {
            Scanner scanner = new Scanner(file);
            List<Shoe> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] strings = line.split(";");
                list.add(new Shoe(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2])));
            }
            List<Shoe> shoes = list.stream().filter(shoe -> shoe.getStockBalance() == 0).collect(Collectors.toList());

            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
            for (Shoe shoe : shoes) {
                pw.println(shoe.getName() + ";" + shoe.getSize() + ";" + shoe.getStockBalance());
            }
            pw.close();
        }catch (FileNotFoundException e){
            System.out.println("Не найден файл");
        }catch (NumberFormatException e){
            System.out.println("Ошибка преобразования числа");
        }

    }

}
