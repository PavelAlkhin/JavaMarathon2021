package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
    public void evaluate(Student student){
        int rnd = (int) (Math.random() * 4 + 2);
        String rate;
        switch (rnd){
            case 5:
                rate = "отлично";
                break;
            case 4:
                rate = "хорошо";
                break;
            case 3:
                rate = "удовлетворительно";
                break;
            case 2:
                rate = "не удовлетворительно";
                break;
            default:
                System.out.println(String.format("Error, rate %s is not in interval from 5 to 2", rnd));
                return;
        }
        System.out.println(String.format("Преподаватель %s оценил студента с именем %s по предмету \"%s\" на оценку \"%s\".",
                this.name, student.getName(), this.subject, rate));

    }
}
