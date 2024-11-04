package top.hyzhu.springboot.filter_interceptor.utils;

import cn.hutool.core.lang.UUID;
import com.aliyun.oss.OSS;
import jakarta.annotation.Resource;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import top.hyzhu.springboot.filter_interceptor.config.OssConfig;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-11-04 18:04
 **/

@Component
@Slf4j
public class OssUtil {
    @Resource
    private OSS ossClient;

    @Resource
    private OssConfig ossConfig;

    public String uploadFile(MultipartFile file) {
        try {
            // 获取文件的原始名称
            String originalFilename = file.getOriginalFilename();
            if (originalFilename == null) {
                throw new IllegalArgumentException("文件名称不能为空");
            }

            // 生成唯一文件名，防止覆盖
            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            String fileName = UUID.randomUUID() + "_" + originalFilename;

            // 添加水印
            BufferedImage originalImage = ImageIO.read(file.getInputStream());
            BufferedImage watermarkedImage = addRepeatedWatermark(originalImage);

            // 将带水印的图片转换为字节流
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(watermarkedImage, fileExtension, outputStream);
            InputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());

            // 上传文件到OSS
            ossClient.putObject(ossConfig.getBucket(), fileName, inputStream);

            // 记录上传日志
            logUpload(file, fileName);

            // 构建文件的URL路径
            return "https://" + ossConfig.getBucket() + "." + ossConfig.getEndpoint().replace("https://", "") + "/" + fileName;
        } catch (Exception e) {
            throw new RuntimeException("文件上传失败: " + e.getMessage(), e);
        }
    }

    // 添加重复水印的函数
    private BufferedImage addRepeatedWatermark(BufferedImage sourceImage) {
        int width = sourceImage.getWidth();
        int height = sourceImage.getHeight();

        // 创建新的 BufferedImage 用于绘制水印
        BufferedImage watermarkedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = watermarkedImage.createGraphics();
        g2d.drawImage(sourceImage, 0, 0, null);

        // 设置水印样式
        g2d.setFont(new Font("Arial", Font.BOLD, 50));
        // 半透明红色
        g2d.setColor(new Color(255, 0, 0, 50));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 设置旋转角度并绘制多个水印
        // 间隔像素数
        int watermarkSpacing = 200;
        // 旋转 -45 度
        g2d.rotate(Math.toRadians(-45), width / 2.0, height / 2.0);
        for (int x = -width; x < width * 2; x += watermarkSpacing) {
            for (int y = -height; y < height * 2; y += watermarkSpacing) {
                g2d.drawString("Huanyou", x, y);
            }
        }

        g2d.dispose();
        return watermarkedImage;
    }

    // 记录上传日志
    private void logUpload(MultipartFile file, String fileName) {
        log.info("文件上传成功: 原始名称: {}, 新文件名: {}, 大小: {} bytes, 上传时间: {}",
                file.getOriginalFilename(), fileName, file.getSize(), new Date());
    }
}