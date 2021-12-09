package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Михал Пихалыч", "Половое воспитание");
        Student studentMototkov = new Student("Молодков");
        for (int i = 1; i < 10; i++)
            teacher.evaluate(studentMototkov);
    }
}
