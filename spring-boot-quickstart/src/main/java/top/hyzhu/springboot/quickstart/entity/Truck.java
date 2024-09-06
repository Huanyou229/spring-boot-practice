package top.hyzhu.springboot.quickstart.entity;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String brand, double loadCapacity) {
        super(licensePlate, brand);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
