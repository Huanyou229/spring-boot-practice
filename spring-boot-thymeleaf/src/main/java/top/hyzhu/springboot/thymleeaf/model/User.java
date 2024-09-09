package top.hyzhu.springboot.thymleeaf.model;

/**
 * @Author: zhy
 * @Description: 用户实体类
 * @Date: 2024-09-09 15:55
 **/
public class User {
    private Long id;
    private String name;
    private String email;
    private String avatar;


    public User(Long id, String name, String email, String avatar) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
