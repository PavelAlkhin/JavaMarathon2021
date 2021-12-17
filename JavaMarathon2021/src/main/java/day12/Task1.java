package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
 * Вывести список в консоль.
 */

public class Task1 {
    public static void main(String[] args) {
        List<String> autos = new ArrayList<>(Arrays.asList("Audi", "BMW", "Lada", "Tesla", "Mercedes"));
        System.out.println(autos);
        autos.add(3, "UAZ");
        System.out.println(autos);
        autos.remove(0);
        System.out.println(autos);
    }
}
