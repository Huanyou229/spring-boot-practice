package top.hyzhu.springboot.quickstart.controller;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.quickstart.entity.Car;
import top.hyzhu.springboot.quickstart.entity.Truck;
import top.hyzhu.springboot.quickstart.entity.Vehicle;
import top.hyzhu.springboot.quickstart.service.VehicleService;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-07 0:33
 **/

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/{licensePlate}")
    public String getVehicleDetails(@PathVariable String licensePlate) {
        // 模拟一个车辆对象，实际应用中可以从数据库或其他服务获取
        Vehicle vehicle = "ABC123".equals(licensePlate) ? new Car("ABC123", "Toyota", 5) :
                "XYZ789".equals(licensePlate) ? new Truck("XYZ789", "Volvo", 10) :
                        new Vehicle("DEF456", "Ford");
        return vehicleService.getVehicleDetails(vehicle);
    }
}

