package top.hyzhu.springboot.quickstart.controller;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.quickstart.entity.Employee;
import top.hyzhu.springboot.quickstart.service.EmployeeService;

import java.util.List;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 19:31
 **/


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/it")
    public List<Employee> getITDepartmentEmployees() {
        return employeeService.getITDepartmentEmployees();
    }

    @GetMapping("/average-age")
    public double getAverageAge() {
        return employeeService.getAverageAge();
    }
}
