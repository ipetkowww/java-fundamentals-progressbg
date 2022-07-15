package homework;

public class WaterAnimal extends Animal {

    public WaterAnimal(String type, String sound) {
        super(type, sound);
    }

    @Override
    public String greet() {
        return super.greet() + " swimming in the ocean!";
    }
}
