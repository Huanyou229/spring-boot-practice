package top.hyzhu.springboot.filter_interceptor.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.hyzhu.springboot.filter_interceptor.filter.AuthFilter;
import top.hyzhu.springboot.filter_interceptor.filter.CorsFilter;
import top.hyzhu.springboot.filter_interceptor.filter.LoggingFilter;
import top.hyzhu.springboot.filter_interceptor.filter.RateLimitFilter;

/**
 * @Author: zhy
 * @Description: 过滤器注册中心
 * @Date: 2024-11-04 13:44
 **/
@Configuration
public class FilterConfig {

    //    @Bean
//    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){
//        FilterRegistrationBean<CustomFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new CustomFilter());
////        设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//        registrationBean.setOrder(1);
//        return registrationBean;
//    }
//@Bean
//public FilterRegistrationBean<LoggingFilter> filterRegistrationBean(){
//    FilterRegistrationBean<LoggingFilter> registrationBean = new FilterRegistrationBean<>();
//    registrationBean.setFilter(new LoggingFilter());
////        设置过滤器拦截的URL路径
//    registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//    registrationBean.setOrder(1);
//    return registrationBean;
//}

//    @Bean
//    public FilterRegistrationBean<AuthFilter> filterRegistrationBean() {
//        FilterRegistrationBean<AuthFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new AuthFilter());
////        设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//        registrationBean.setOrder(2);
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean<CorsFilter> filterRegistrationBean() {
//        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new CorsFilter());
////        设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//        registrationBean.setOrder(3);
//        return registrationBean;
//    }

//    @Bean
//    public FilterRegistrationBean<CorsFilter> filterRegistrationBean() {
//        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new CorsFilter());
////        设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//        registrationBean.setOrder(3);
//        return registrationBean;
//    }

//        @Bean
//    public FilterRegistrationBean<RateLimitFilter> filterRegistrationBean() {
//        FilterRegistrationBean<RateLimitFilter> registrationBean = new FilterRegistrationBean<>();
//        registrationBean.setFilter(new RateLimitFilter());
////        设置过滤器拦截的URL路径
//        registrationBean.addUrlPatterns("/*");
////        设置过滤器的执行顺序,值越小优先级越高
//        registrationBean.setOrder(3);
//        return registrationBean;
//    }

}
