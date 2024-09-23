package top.hyzhu.springboot.configure.entity;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: zhy
 * @Description:
 * @Date: 2024-09-23 13:56
 **/
@Data
@Component
@ConfigurationProperties(prefix = "server")
public class Server {
    private String host;

    private Integer port;

    private String contextPath;
//    @Value("${server.host}")
//    private String host;
//
//    @Value("${server.post}")
//    private Integer port;
//
//    @Value("${server.context-path}")
//    private String contextPath;
}
