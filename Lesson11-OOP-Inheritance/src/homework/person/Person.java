package homework.person;

public class Person {

    private String name;
    private int age;
    private boolean isMale;

    public Person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String showPersonInfo() {
        String heOrShe;
        String gender;
        if (isMale) {
            heOrShe = "he";
            gender = "male";
        } else {
            heOrShe = "she";
            gender = "female";
        }
        return String.format("Name: %s is %d years old and %s is %s.", name, age, heOrShe, gender);
    }

    public int getAge() {
        return age;
    }
}