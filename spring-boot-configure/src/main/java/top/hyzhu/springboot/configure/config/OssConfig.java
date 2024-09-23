package top.hyzhu.springboot.configure.config;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-24 1:21
 **/

@Configuration
@PropertySource("classpath:aliyun-oss.properties")
@ConfigurationProperties(prefix = "aliyun-oss")
@Data
public class OssConfig {
    private String endpoint;
    private String bucket;
    private String dir;
    private String host;
    private String ak;
    private String secret; }
