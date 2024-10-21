package top.hyzhu.springboot.redis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.redis.result.Result;
import top.hyzhu.springboot.redis.service.SmsService;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 15:08
 **/
@RestController
@RequestMapping("/sms")
@AllArgsConstructor
public class SmsController {
    private final SmsService smsService;

    @PostMapping("/send")
    public Result<Object> sendSms(@RequestParam("phone") String phone){
        smsService.sendSms(phone);
        return Result.ok();
    }
}
