package homework.zoo;

import homework.zoo.Animal;
import homework.zoo.animals.*;

public class Demo {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog(), new Elephant(), new Fish(), new Lion(), new Monkey(), new Shark(), new Whale(), new Wolf()
        };

        System.out.println("== Make Sound ==");
        makeSoundOf(animals);

        System.out.println();

        System.out.println("== Greet ==");
        greetOf(animals);

    }

    public static void makeSoundOf(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }

    public static void greetOf(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.greet());
        }
    }

}
