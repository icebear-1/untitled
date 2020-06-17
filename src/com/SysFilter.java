package com;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/*")
public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        Object url=request.getRequestURL();
        String uri=url.toString();
        if(uri.endsWith("index.jsp")){

        }else {
            HttpSession session=request.getSession();
            if(session!=null){
                Object obj=session.getAttribute("session_account");
                if(obj==null){
                    request.getRequestDispatcher("/index.jsp").forward(request,response);
                }
            }
        }
        filterChain.doFilter(request,response);



//                HttpServletRequest request=(HttpServletRequest) servletRequest;
//        HttpServletResponse response=(HttpServletResponse) servletResponse;
//        Object url=request.getRequestURL();
//        String uri= url.toString();
//        if(uri.endsWith("index.jsp")){
//
//        }else {
//            HttpSession session=request.getSession();
//            if(session!=null){
//                Object obj=session.getAttribute("session_account");
//                if(obj==null){
//                    request.getRequestDispatcher("/index.jsp").forward(request,response);
//                }
//            }
//        }
//        filterChain.doFilter(request,response);
    }
    @Override
    public void destroy() {

    }
}
