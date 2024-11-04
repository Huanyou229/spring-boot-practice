package top.hyzhu.springboot.filter_interceptor.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.hyzhu.springboot.filter_interceptor.filter.CorsFilter;
import top.hyzhu.springboot.filter_interceptor.interceptor.AuthInterceptor;
import top.hyzhu.springboot.filter_interceptor.interceptor.ImageUploadInterceptor;
import top.hyzhu.springboot.filter_interceptor.interceptor.LoggingInterceptor;

/**
 * @Author: zhy
 * @Description: 拦截器注册中心
 * @Date: 2024-11-04 14:54
 **/
@Configuration
@AllArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    private final LoggingInterceptor loggingInterceptor;
    private final AuthInterceptor authInterceptor;
    //    private final CORSInterceptor corsInterceptor;
    private final ImageUploadInterceptor imageUploadInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        添加了拦截器，并添加了拦截地址
        registry.addInterceptor(loggingInterceptor).addPathPatterns("/**");
        registry.addInterceptor(authInterceptor).addPathPatterns("/**");
//        registry.addInterceptor(corsInterceptor).addPathPatterns("/**");
        // 注册图片上传拦截器并指定路径
        registry.addInterceptor(imageUploadInterceptor).addPathPatterns("/upload");

    }

    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedOriginPattern("*");
        corsConfiguration.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter();
//        return new CorsFilter(source);
    }
}
