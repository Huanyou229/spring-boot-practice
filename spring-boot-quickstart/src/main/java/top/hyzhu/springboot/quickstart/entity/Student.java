package top.hyzhu.springboot.quickstart.entity;

/**
 * @Author: zhy
 * @Description: 学生类
 * @Date: 2024-09-06 23:55
 **/
public class Student {
    private Long id;
    private String name;
    private int age;
    private String major;

    // Constructors, getters, and setters
    public Student(Long id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}

