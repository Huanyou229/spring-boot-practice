package top.hyzhu.springboot.quickstart.controller;
import org.springframework.web.bind.annotation.*;
import top.hyzhu.springboot.quickstart.service.OrderService;
/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-06 21:01
 **/
@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}/status")
    public void printDeliveryStatus(@PathVariable Long id) {
        orderService.printDeliveryStatus(id);
    }

    @GetMapping("/{id}/status-or-default")
    public String getDeliveryStatusOrDefault(@PathVariable Long id) {
        return orderService.getDeliveryStatusOrDefault(id);
    }

    @GetMapping("/{id}/process-status")
    public void processDeliveryStatusStream(@PathVariable Long id) {
        orderService.processDeliveryStatusStream(id);
    }
}


