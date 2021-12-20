package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван Петров", "ВМ07");
        Teacher teacher = new Teacher("Михаил Петрович Иванов", "Программирование JAVA");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
