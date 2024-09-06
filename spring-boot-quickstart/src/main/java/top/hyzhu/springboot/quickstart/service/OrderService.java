package top.hyzhu.springboot.quickstart.service;
import org.springframework.stereotype.Service;
import top.hyzhu.springboot.quickstart.entity.Order;
import java.util.Optional;
import java.util.List;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 21:00
 **/

@Service
public class OrderService {
    private List<Order> orders = List.of(
            new Order(1L, "Laptop", "Delivered"),
            new Order(2L, "Smartphone", null), // 未交付
            new Order(3L, "Tablet", "Pending")
    );

    // 使用 ifPresentOrElse 打印订单状态或执行默认操作
    public void printDeliveryStatus(Long orderId) {
        findOrderById(orderId).ifPresentOrElse(
                order -> order.getDeliveryStatus().ifPresentOrElse(
                        status -> System.out.println("Order delivery status: " + status),
                        () -> System.out.println("Delivery status not available")
                ),
                () -> System.out.println("Order not found")
        );
    }

    // 使用 or 提供一个默认的 Optional 值
    public String getDeliveryStatusOrDefault(Long orderId) {
        return findOrderById(orderId)
                .flatMap(Order::getDeliveryStatus) // 使用 flatMap 展开 Optional<Optional<String>>
                .or(() -> Optional.of("Unknown"))  // 若状态为空，返回默认值“Unknown”
                .get();
    }

    // 使用 stream 方法将 Optional 转换为流
    public void processDeliveryStatusStream(Long orderId) {
        findOrderById(orderId).flatMap(Order::getDeliveryStatus)
                .stream()
                .forEach(status -> System.out.println("Processing delivery status: " + status));
    }

    private Optional<Order> findOrderById(Long id) {
        return orders.stream()
                .filter(order -> order.getId().equals(id))
                .findFirst();
    }
}


