package com;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//@WebFilter(filterName = "abc",urlPatterns = "/*")
//@WebFilter(urlPatterns = "/*")
//@WebFilter(value= "/*")
//@WebFilter("/*")
//数组
//@WebFilter({"","",""})
//@WebFilter("/login/abc")
//@WebFilter("*.do")
//@WebFilter(value = "/login",dispatcherTypes = DispatcherType.FORWARD)
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("出生");
//    }
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletResponse.setCharacterEncoding("utf-8");
//        servletResponse.setContentType("text/htmi;charset=UTF-8");
//        System.out.println("MyFilter");
//
//        //放行
//        filterChain.doFilter(servletRequest,servletResponse);
//    }
//    @Override
//    public void destroy() {
//        System.out.println("销毁");
//    }
//}
