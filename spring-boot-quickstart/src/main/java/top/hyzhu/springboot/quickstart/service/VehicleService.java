package top.hyzhu.springboot.quickstart.service;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.Car;
import top.hyzhu.springboot.quickstart.entity.Truck;
import top.hyzhu.springboot.quickstart.entity.Vehicle;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-07 0:32
 **/

@Service
public class VehicleService {

    public String getVehicleDetails(Vehicle vehicle) {
        // 使用 JDK 17 模式匹配简化类型检查和转换
        if (vehicle instanceof Car car) {
            return "Car - Brand: " + car.getBrand() + ", Seating Capacity: " + car.getSeatingCapacity();
        } else if (vehicle instanceof Truck truck) {
            return "Truck - Brand: " + truck.getBrand() + ", Load Capacity: " + truck.getLoadCapacity() + " tons";
        } else {
            return "Vehicle - Brand: " + vehicle.getBrand();
        }
    }
}

