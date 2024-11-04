package top.hyzhu.springboot.filter_interceptor.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;
import top.hyzhu.springboot.filter_interceptor.utils.OssUtil;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-11-04 13:47
 **/
@RestController
@AllArgsConstructor
public class TestController {
    private final OssUtil ossUtil;

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @PostMapping("/upload")
    public Map<String, Object> uploadFile(@RequestParam("file") MultipartFile file) {
        String fileUrl = ossUtil.uploadFile(file);
        Map<String, Object> response = new HashMap<>();
        response.put("file", fileUrl);
        return response;
    }
}
