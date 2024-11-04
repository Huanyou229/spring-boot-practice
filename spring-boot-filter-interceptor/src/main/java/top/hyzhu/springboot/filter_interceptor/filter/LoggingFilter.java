package top.hyzhu.springboot.filter_interceptor.filter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.time.LocalDateTime;


/**
 * @Author: zhy
 * @Description: 日志记录过滤器
 * @Date: 2024-11-04 13:53
 **/
@Slf4j
public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("LoggingFilter初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//       向下转型
        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        请求资源的路径
        String path = request.getRequestURI();
//        请求的客户端地址
        String clientIp = request.getRemoteAddr();
        //请求的开始时间
        LocalDateTime beginTime= LocalDateTime.now();
        log.info("请求已经到达过滤器：path:{},clientIp={},time={}", path, clientIp, LocalDateTime.now());
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("过滤器响应处理完毕：path:{},endTime={}",path,LocalDateTime.now());

    }

    @Override
    public void destroy() {
        log.info("LoggingFilter销毁");
    }
}
