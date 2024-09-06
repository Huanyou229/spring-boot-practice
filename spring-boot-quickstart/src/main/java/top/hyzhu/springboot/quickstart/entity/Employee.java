package top.hyzhu.springboot.quickstart.entity;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 18:37
 **/
public class Employee {
    private Long id;
    private String name;
    private int age;
    private String department;

    public Employee(Long id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter 和 Setter 方法
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}

