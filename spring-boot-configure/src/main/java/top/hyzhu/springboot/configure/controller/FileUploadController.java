package top.hyzhu.springboot.configure.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import top.hyzhu.springboot.configure.util.OssTemplate;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-24 1:24
 **/
@RestController
@RequestMapping(value = "/file")
public class FileUploadController {
    @Resource
    private OssTemplate ossTemplate;

    /**
     * oss ⽂件上传
     * @param file ⽂件对象
     * @return ⽂件上传后的地址
     */
    @PostMapping("/oss")
    public String ossUpload(MultipartFile file) {
        return ossTemplate.ossUpload(file);
    }

}
