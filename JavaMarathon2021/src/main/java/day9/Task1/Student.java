package day9.Task1;

public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("Этот человек с именем %s", super.getName()));
        System.out.println(String.format("Этот студент с именем %s", super.getName()));
    }
}
