package top.hyzhu.springboot.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-28 14:55
 **/

@Data
@TableName("stock_price")
public class StockPrice {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;
    private Double price;
    private LocalDateTime updateTime;
}
