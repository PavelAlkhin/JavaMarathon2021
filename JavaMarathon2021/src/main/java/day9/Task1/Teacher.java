package day9.Task1;

public class Teacher extends Human{

    public String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public void printInfo() {
        System.out.println(String.format("Этот человек с именем %s", super.getName()));
        System.out.println(String.format("Этот преподаватель с именем %s", super.getName()));
    }

}
