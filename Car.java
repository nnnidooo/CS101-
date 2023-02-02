public class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void move() {
        System.out.println("Car is moving");
    }

    //getter og setter

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ",price=" + price + '\'' +
                '}';

    }

}