package homework.zoo;

import homework.zoo.Animal;

public class LandAnimal extends Animal {

    public LandAnimal(String type, String sound) {
        super(type, sound);
    }

    @Override
    public String greet() {
        return super.greet() + " running in the wild!";
    }
}
