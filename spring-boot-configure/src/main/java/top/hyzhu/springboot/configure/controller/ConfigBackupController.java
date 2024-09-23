package top.hyzhu.springboot.configure.controller;

import top.hyzhu.springboot.configure.service.ConfigBackupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: zhy
 * @Description: ConfigBackupController
 * @Date: 2024-09-24 2:23
 **/
 @RestController
@AllArgsConstructor
public class ConfigBackupController {

    private final ConfigBackupService configBackupService;

    @GetMapping("/backup")
    public void backupConfig() {
        configBackupService.backupConfigFile();
    } }
