package top.hyzhu.springboot.configure.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.hyzhu.springboot.configure.service.LogService;

/**
 * @Author: zhy
 * @Description: LogController
 * @Date: 2024-09-24 2:15
 **/
@RestController
@AllArgsConstructor
public class LogController {

    private final LogService logService;

    @GetMapping("/log")
    public void logMsg() {
        logService.logMessage();
    } }