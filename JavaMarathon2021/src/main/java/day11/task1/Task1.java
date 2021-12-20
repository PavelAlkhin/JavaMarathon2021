package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        businessProcess(courier1, 10_000);
        businessProcess(picker1, 10_000);

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        businessProcess(courier2, 2);
        businessProcess(picker2, 2);

        System.out.println(courier1);
        System.out.println(courier2);
        System.out.println(picker1);
        System.out.println(picker2);
    }

    static void businessProcess(Worker worker, int count) {
        for (int i = 1; i <= count; i++) {
            worker.doWork();
        }
    }

}
