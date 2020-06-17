package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String account=request.getParameter("account");
//      //  System.out.println(account);
//        response.getWriter().write("hello");

        String account=request.getParameter("account");
        HttpSession session=request.getSession();

        if("admin".equals(account)){
            session.setAttribute("session_account",account);
            session.setMaxInactiveInterval(20*60);
            request.getRequestDispatcher("/success").forward(request,response);
        }else {
            System.out.println("账号错误");
            response.sendRedirect("/index.jsp");
        }

//
//        String account=request.getParameter("account");
//        HttpSession session=request.getSession();
//        if("admin".equals(account)){
//            session.setAttribute("session_account",account);
//            session.setMaxInactiveInterval(20*60);
//            request.getRequestDispatcher("/success").forward(request,response);
//        }else {
//            System.out.println("账号错误");
//            response.sendRedirect("/index.jsp");
//        }
   }
}
