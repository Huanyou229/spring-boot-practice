package top.hyzhu.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.configure.entity.Mail;
import top.hyzhu.springboot.configure.service.EmailService;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-24 2:35
 **/
@RestController
@AllArgsConstructor
public class EmailController {
    private final EmailService emailService;
    @GetMapping("/mail")
    public void sendEmail(@RequestBody Mail mail) {
        emailService.sendSimpleEmail(mail.getTo(), mail.getSubject(), mail.getBody());
    } }
