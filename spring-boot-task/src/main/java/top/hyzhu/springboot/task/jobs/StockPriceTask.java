package top.hyzhu.springboot.task.jobs;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.hyzhu.springboot.task.entity.StockPrice;
import top.hyzhu.springboot.task.mapper.StockPriceMapper;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @Author: zhy
 * @Description: 定时任务：每隔10秒更新一次股票价格，并持久化到数据库
 * @Date: 2024-10-28 14:59
 **/

//@Component
@AllArgsConstructor
@Slf4j
public class StockPriceTask {
    private final StockPriceMapper stockPriceMapper;
//    public final Random random = new Random();
//
//    @Scheduled(fixedRate = 1000)
//    public void updateStockPrice() {
//        double price = 100+  random.nextDouble() * 50;
//        StockPrice stockPrice = new StockPrice();
//        stockPrice.setPrice(price);
//        stockPrice.setName("小米");
//        stockPrice.setUpdateTime(LocalDateTime.now());
//
//        // 使用String.format()格式化价格为两位小数
////        使用了String.format("%.2f", price)来将价格格式化为两位小数的字符串，
////        然后通过Double.parseDouble()将其转换回double类型，以便设置到StockPrice对象中
//        stockPrice.setPrice(Double.parseDouble(String.format("%.2f", price)));
//
//        stockPriceMapper.insert(stockPrice);
//        log.info("更新股票价格: {},时间{}", price, LocalDateTime.now());
//
//    }

}
