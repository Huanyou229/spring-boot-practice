package top.hyzhu.springboot.filter_interceptor.interceptor;

import cn.hutool.core.util.StrUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-11-04 18:03
 **/
@Component
@Slf4j
public class ImageUploadInterceptor implements HandlerInterceptor {
    // 文件大小限制为 5 MB
    private static final long MAX_FILE_SIZE = 5 * 1024 * 1024;
    // 允许的文件类型
    private static final String[] ALLOWED_TYPES = { "image/jpeg", "image/png", "image/gif", "image/jpg"};
    // 图片尺寸的最大宽度和高度
    private static final int MAX_WIDTH = 2000;
    private static final int MAX_HEIGHT = 2000;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 检查请求类型是否为文件上传请求
        if (!(request instanceof MultipartHttpServletRequest multipartRequest)) {
            response.getWriter().write("请求类型错误，未包含文件");
            return false;
        }

        // 获取文件，表单字段名为 "file"
        MultipartFile file = multipartRequest.getFile("file");

        // 设置响应编码和类型为 UTF-8，防止中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/plain; charset=UTF-8");

        // 1. 文件类型检查
        assert file != null;
        String fileType = file.getContentType();
        // 检查文件类型是否在允许范围内
        if (!StrUtil.containsAny(fileType, ALLOWED_TYPES)) {
            response.getWriter().write("文件类型不支持");
            return false;
        }

        // 2. 文件大小限制
        // 检查文件大小是否超过限制
        if (file.getSize() > MAX_FILE_SIZE) {
            response.getWriter().write("上传文件大小超出限制（5MB）");
            return false;
        }

        // 3. 图片尺寸检查
        // 获取图像对象并检查其尺寸
        BufferedImage image = ImageIO.read(file.getInputStream());
        if (image.getWidth() > MAX_WIDTH || image.getHeight() > MAX_HEIGHT) {
            response.getWriter().write("图片尺寸超出限制(最大2000*2000)");
            return false;
        }
        // 如果所有检查均通过，返回 true 继续执行后续逻辑
        return true;
    }
}