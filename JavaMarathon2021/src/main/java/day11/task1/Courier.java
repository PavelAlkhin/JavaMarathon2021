package day11.task1;

public class Courier implements Worker {

    private int salary;

    private boolean isPayed;

    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                ", warehouse=" + warehouse +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() > 9999) {
            if (isPayed) {
                System.out.println("Бонус уже был выплачен");
            } else {
                salary += 50_000;
                System.out.println("Выплачен бонус в размере 50_000");
            }
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}
