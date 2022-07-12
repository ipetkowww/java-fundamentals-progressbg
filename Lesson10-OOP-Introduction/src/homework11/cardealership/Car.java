package homework11.cardealership;

public class Car {

    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return model;
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("model: %s and price: %.2f dollars", getModel().toUpperCase(), getPrice());
    }

}
