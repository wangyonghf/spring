package wangyongyong.wy.servletfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;

/**
 * Created by wangyongyong.wy on 17/6/28.
 */
//@Component
    @WebFilter
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("<<<<<<<<<<<< " +this.getClass()+ " init >>>>>>>>>>>");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        System.out.println("<<<<<<<<<<<< " +this.getClass()+ " doFilter >>>>>>>>>>>");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
