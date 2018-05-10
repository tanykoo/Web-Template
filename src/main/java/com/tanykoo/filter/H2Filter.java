package com.tanykoo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
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
        httpRequest.getRequestURI();
        logger.debug(reqhost);
    }

    @Override
    public void destroy() {

    }
}
