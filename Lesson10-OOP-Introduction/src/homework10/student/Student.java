package homework10.student;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " + name + " is " + age + " years old";
    }
}
