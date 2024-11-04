package top.hyzhu.springboot.filter_interceptor.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: zhy
 * @Description: OssConfig
 * @Date: 2024-10-30 18:03
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
    private String secret;
    // 创建 OSS 客户端的 Bean
    @Bean
    public OSS ossClient() {
        return new OSSClientBuilder().build(endpoint, ak, secret);
    }
}
