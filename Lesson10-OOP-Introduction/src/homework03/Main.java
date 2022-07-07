package homework03;

import person.Person;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 31);
        Person dani = new Person("Dani", 30);
        Person pesho = new Person("Pesho", 20);
        Person ani = new Person("Ani", 22);

        Person[] persons = new Person[4];
        persons[0] = ivan;
        persons[1] = dani;
        persons[2] = pesho;
        persons[3] = ani;

        printInfoForAllPersons(persons);
    }

    static void printInfoForAllPersons(Person[] persons) {
        for (Person person : persons) {
            person.printPersonalInfo();
        }
    }

}
