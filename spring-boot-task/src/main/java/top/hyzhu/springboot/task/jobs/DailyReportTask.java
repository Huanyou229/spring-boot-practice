package top.hyzhu.springboot.task.jobs;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import top.hyzhu.springboot.task.service.MailService;

import java.time.LocalDateTime;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-28 15:45
 **/

//@Component
@AllArgsConstructor
@Slf4j
public class DailyReportTask {
    private final MailService mailService;

    @Scheduled(cron = "0 39 16 * * ?")
    public void sendReport() {
        String report = "这是每次数据报表的内容";
        mailService.sendMail("2499669698@qq.com", "每日数据报表", report);
        log.info("报表已生成，发送邮件完成？{}", LocalDateTime.now());
    }
}
