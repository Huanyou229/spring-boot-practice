package top.hyzhu.springboot.filter_interceptor.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @Author: zhy
 * @Description: 认证和授权过滤器
 * @Date: 2024-11-04 14:09
 **/

public class AuthFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("AuthFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String authToken = request.getHeader("Authorization");
        //是匹配的token
        if ("hello".equals(authToken)) {
//  放行
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //返回401未认证错误
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("UNAUTHORIZED");
        }
    }

    @Override
    public void destroy() {
        log.info("AuthFilter destroy");
    }
}
