package com.jie.redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wei zhijie
 * @version 1.0
 * @date 2022/9/6
 */
public class redirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String  username = req.getParameter("username");
        String  password = req.getParameter("password");
        System.out.println(username+":"+password);


        //相关的重定向功能模块

        resp.sendRedirect("/successful.jsp");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
