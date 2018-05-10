package com.tanykoo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author ThinkPad
 * Created : 2018-05-10 19:55
 * @Since
 */
public class H2Filter implements Filter {
    private Logger logger = LoggerFactory.getLogger(H2Filter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String reqhost = servletRequest.getRemoteHost();
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        logger.debug(reqhost);
        logger.debug(httpRequest.getRequestURI());

        if(true){
            /* 过滤器重定向 */
            httpServletResponse.sendRedirect(httpRequest.getContextPath()+"/user/login");
        }else {
            /* 过滤完成后需要继续请求*/
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
