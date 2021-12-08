package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a >= b){
            System.out.println("Некорректный ввод");
            return;
        }

        for (int i = a; i <= b; i++){
            int mod5 = i%5;
            int mod10 = i%10;
            if (mod5==0 && mod10!=0){
                System.out.print(i);
                System.out.print(" ");

            }
        }

    }
}
