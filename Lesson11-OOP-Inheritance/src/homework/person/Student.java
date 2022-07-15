package homework.person;

public class Student extends Person {

    private double score;

    public Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        this.score = score;
    }

    public String showStudentInfo() {
        return super.showPersonInfo() + "Also a student with score " + score;
    }
}
