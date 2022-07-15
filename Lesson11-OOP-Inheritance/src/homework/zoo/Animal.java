package homework.zoo;

public class Animal {

    private String type;
    private String sound;

    public Animal(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public String makeSound() {
        return String.format("I am %s and I %s", type, sound);
    }

    public String greet() {
        return String.format("I am a %s and I love", type);
    }
}
