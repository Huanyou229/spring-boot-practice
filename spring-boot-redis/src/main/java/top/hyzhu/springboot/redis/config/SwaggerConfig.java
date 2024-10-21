package top.hyzhu.springboot.redis.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhy
 * @Description: SwaggerConfig
 * @Date: 2024-10-21 16:19
 **/
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Huanyou 的 API").
                        contact(new Contact().name("Huanyou").email("2499669698@qq.com"))
                        .version("1.0")
                        .description("Huanyou 的 API 接⼝⽂档")
                        .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com")));
    } }
