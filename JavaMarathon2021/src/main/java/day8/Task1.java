package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String text = "1";
        for (int i = 2; i < 20001; i++) {
            text += " " + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Результат конкатенации");
        System.out.println(text);
        System.out.println(String.format("Это заняло %s", stopTime - startTime));

        startTime = System.currentTimeMillis();
        text = "";
        StringBuilder str = new StringBuilder();
        str.append("1");
        for (int i = 2; i < 20001; i++) {
            str.append(" " + i);
        }
        stopTime = System.currentTimeMillis();
        System.out.println("Результат билдера");
        System.out.println(str.toString());
        System.out.println(String.format("Это заняло %s", stopTime - startTime));
    }
}
