package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String sep = File.separator;
        String path = "C:" + sep + "Users" + sep + "pvl" + sep + "IdeaProjects" + sep + "JavaMarathon2021" + sep + "JavaMarathon2021" + sep + "people.txt";
        File file = new File(path);
        System.out.println(parseFileToObjList(file).toString());
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> stringList = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return stringList;
        }
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] peopleAge = line.split(" ");
            int age = Integer.parseInt(peopleAge[1]);
            if(age <= 0){
                try {
                    throw new ScannerException("");
                }catch (ScannerException e){
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
            stringList.add(new Person(peopleAge[0], age));
        }
        return stringList;
    }
}
