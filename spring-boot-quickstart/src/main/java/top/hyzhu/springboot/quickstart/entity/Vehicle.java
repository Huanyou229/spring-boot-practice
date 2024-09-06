package top.hyzhu.springboot.quickstart.entity;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-07 0:29
 **/
public class Vehicle {
    private String licensePlate;
    private String brand;

    public Vehicle(String licensePlate, String brand) {
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }
}

