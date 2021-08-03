package com.example.SprigBootHelloWolrd.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter(filterName = "helloFilter" , urlPatterns = "/helloServlet")
public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest ServReq , ServletResponse ServRes , FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Executing doFilter method");
        filterChain.doFilter(ServReq , ServRes);
        System.out.println("Done Executing doFilter method");
    }
}
