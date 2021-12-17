package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillIn(list, 0, 30);
        fillIn(list, 300, 350);
        System.out.println(list);
    }

    public static void fillIn(List<Integer> list, int startInt, int endInt){
        for (int i = startInt; i <= endInt; i++){
            list.add(i);
        }
    }



}
