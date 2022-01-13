package day19;

import com.sun.prism.shader.Solid_TextureYV12_Loader;

import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {

//        listList();

//        setSet();

    }

    private static void listList() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "три");
        map.put(1, "sv;pjk");
        map.put(3, "тgrgregри");

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map);

        System.out.println(map.get(1));
        System.out.println(map.get(6));
    }

    public static void setSet(){
        // У Set все элементы уникальны. Одиночные элементы. Нет одинаковых элементов.

        Set<String> hashSet = new HashSet<>(); // Порядка нет! как и в Map. Извлекаются случайно. Самый быстрый, чаще используется. На самом деле это HashMap, в котором ключ это значение Set<>.
        Set<String> linkedHashSet = new LinkedHashSet<>(); //сохраняется порядок ввода как и в List. Основан на HashSet, а он от <- HasMap.
        Set<String> treeSet = new TreeSet<>(); // объекты сортируются в их есстественном порядке. (лексикографический порядк строк, цифры по возрастанию). Основан на TreeMap.

        hashSet.add("qqqqqq1");
        hashSet.add("wewewe2");
        hashSet.add("qqqqqq3");
        hashSet.add("wewewe4");
        hashSet.add("qqqqqq1");
        hashSet.add("qqqqqq1");

        for (String name: hashSet){
            System.out.println(name);
        }

        System.out.println(hashSet.contains("qqqqqq1"));
        //метод contains очень быстрый, так как используется хеширование. Константное время. В List нужно пройтись по всем элементам (это долго).

        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet);

        // работа с множествами
        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // объединение union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // пересечение intersection
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);

        //разность difference
        Set<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println(diff);
    }

    private static void mapMap(){
        Map<Integer, String> map = new HashMap<>(); //реализован как массив LinkedList


    }
}
