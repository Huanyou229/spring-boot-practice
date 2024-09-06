package top.hyzhu.springboot.quickstart.entity;
import java.util.Optional;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 20:59
 **/
public class Order {
    private Long id;
    private String product;
    private Optional<String> deliveryStatus;

    public Order(Long id, String product, String deliveryStatus) {
        this.id = id;
        this.product = product;
        this.deliveryStatus = Optional.ofNullable(deliveryStatus); // 允许交付状态为空
    }

    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public Optional<String> getDeliveryStatus() {
        return deliveryStatus;
    }
}

