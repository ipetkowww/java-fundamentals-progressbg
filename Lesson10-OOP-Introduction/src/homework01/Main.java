package homework01;

import person.Person;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Ivan", 31);
        System.out.printf("My name is %s and I am %d years old.%n", ivan.name, ivan.age);
    }
}
