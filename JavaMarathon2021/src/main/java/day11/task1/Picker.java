package day11.task1;

public class Picker implements Worker {

    private int salary;

    private boolean isPayed;

    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() > 9999) {
            if (isPayed) {
                System.out.println("Бонус уже был выплачен");
            } else {
                salary += 70_000;
                System.out.println("Выплачен бонус в размере 70_000");
            }
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }


}
