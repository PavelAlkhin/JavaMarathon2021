package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        Random rnd = new Random();
        for(int i = 1; i<=len; i++){
            int a = rnd.nextInt(10);
            arr[i-1] = a;
        }
        System.out.println(String.format("Введено число %s. Сгенерирован следующий массив:", len));
        int moreEigth = 0;
        int one = 0;
        int chetn = 0;
        int nechetn = 0;
        int amount = 0;
        for(int rr: arr){
            if (rr > 8){
                moreEigth = moreEigth + 1;
            }
            if (rr==1){
                one = one + 1;
            }
            if (rr%2==0){
                chetn = chetn + 1;
            }
            if (rr%2!=0){
                nechetn = nechetn + 1;
            }

            amount = amount + rr;
            System.out.print(rr);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(String.format("Информация о массиве:"));
        System.out.println(String.format("Длина массива: %s", len));
        System.out.println(String.format("Количество чисел больше 8: %s", moreEigth));
        System.out.println(String.format("Количество чисел равных 1: %s", one));
        System.out.println(String.format("Количество четных чисел: %s", chetn));
        System.out.println(String.format("Количество нечетных чисел: %s", nechetn));
        System.out.println(String.format("Сумма всех элементов массива: %s", amount));

    }
}
