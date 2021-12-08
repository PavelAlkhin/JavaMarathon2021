package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            String country = "";
            String enter = scanner.next();
            switch (enter) {
                case "Stop":
                   cont = false;
                   break;
                case ("Москва"):
                    country = "Россия";
                    break;
                case "Владивосток":
                    country = "Россия";
                    break;
                case ("Ростов"):
                    country = "Россия";
                    break;
                case "Рим":
                    country = "Италия";
                    break;
                case "Милан":
                    country = "Италия";
                    break;
                case "Турин":
                    country = "Италия";
                    break;
                case ("Ливерпуль"):
                    country = "Англия";
                    break;
                case "Манчестер":
                    country = "Англия";
                    break;
                case ("Лондон"):
                    country = "Англия";
                    break;
                case "Берлин":
                    country = "Германия";
                    break;
                case "Мюнхен":
                    country = "Германия";
                    break;
                case "Кёльн":
                    country = "Германия";
                    break;
                default:
                    country = "Неизвестная страна";
            }
            if (!country.equals(""))
                System.out.println(country);
        }
    }
}
