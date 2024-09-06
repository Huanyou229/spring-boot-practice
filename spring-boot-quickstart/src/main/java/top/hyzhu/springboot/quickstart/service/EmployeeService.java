package top.hyzhu.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.Employee;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 18:40
 **/


@Service
public class EmployeeService {
    private List<Employee> employees = Arrays.asList(
            new Employee(1L, "Alice", 28, "HR"),
            new Employee(2L, "Bob", 35, "IT"),
            new Employee(3L, "Charlie", 32, "Finance"),
            new Employee(4L, "David", 25, "IT")
    );

    // 使用 Lambda 表达式过滤 IT 部门的员工
    public List<Employee> getITDepartmentEmployees() {
        return employees.stream()
                .filter(employee -> "IT".equals(employee.getDepartment()))
                .collect(Collectors.toList());
    }

    // 使用 Lambda 表达式计算平均年龄
    public double getAverageAge() {
        return employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0);
    }
}

