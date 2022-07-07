package homework04;

import person.Person;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 31, false);
        Person dani = new Person("Dani", 30, false);
        Person pesho = new Person("Pesho", 20, true);
        Person ani = new Person("Ani", 22, true);

        Person[] persons = new Person[4];
        persons[0] = ivan;
        persons[1] = dani;
        persons[2] = pesho;
        persons[3] = ani;

        printInfoForStudentsOnly(persons);
    }

    static void printInfoForStudentsOnly(Person[] persons) {
        for (Person person : persons) {
            if (person.isStudent) {
                person.printPersonalInfo();
            }
        }
    }
}
