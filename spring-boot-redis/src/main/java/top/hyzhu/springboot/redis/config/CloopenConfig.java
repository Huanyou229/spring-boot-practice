package top.hyzhu.springboot.redis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-10-21 14:57
 **/

@Data
@Configuration
@ConfigurationProperties(prefix = "hyzhu.sms.ccp")
public class CloopenConfig {

    private String serverIp;
    private String port;
    private String accountSId;
    private String accountToken;
    private String appId;
    private String templateId;

}
