package top.hyzhu.springboot.quickstart.entity;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String licensePlate, String brand, int seatingCapacity) {
        super(licensePlate, brand);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
