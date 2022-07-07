package person;

public class Person {

    public String name;
    public int age;
    public boolean isStudent;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean isStudent) {
        this(name, age);
        this.isStudent = isStudent;
    }

    public void printPersonalInfo() {
        String occupation = getOccupation();
        System.out.printf("My name is %s and I am %d years old. %s%n", this.name, this.age, occupation);
    }

    String getOccupation() {
        String result = this.isStudent ? "am" : "am not";
        return "I " + result + " a student";
    }

}
