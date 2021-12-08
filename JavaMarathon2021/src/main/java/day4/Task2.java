package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rnd = new Random();
        for (int i = 2; i < 100; i++){
//            int a = (int) (Math.random() * 10000);
            int a =  rnd.nextInt(10000);
            arr[i] = a;
        }
        int amount_zero = 0;
        int itog_zero = 0;
        int naib = arr[0];
        int naim = arr[0];
        for(int rr: arr){
            if (rr%10==0){
                amount_zero = amount_zero + 1;
                itog_zero = itog_zero + rr;
            }
            if(naib<rr)
                naib = rr;
            if(naim>rr)
                naim = rr;
        }
        System.out.println();
        System.out.println(String.format("Информация о массиве:"));
        System.out.println(String.format("Наибольший элемент массива: %s", naib));
        System.out.println(String.format("Наименьший элемент массива: %s", naim));
        System.out.println(String.format("Количество элементов массива, оканчивающихся на 0: %s", amount_zero));
        System.out.println(String.format("Сумма элементов массива, оканчивающихся на 0: %s", itog_zero));

    }
}
