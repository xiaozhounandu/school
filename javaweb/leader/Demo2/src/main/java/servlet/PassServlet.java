package servlet;

import user.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @ClassName servlet.PassServlet
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-13-21-18
 */


public class PassServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        // 获取参数值
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String age = request.getParameter("age");
        String email = request.getParameter("email");
        // 创建封装用户信息的JavaBean对象
        UserInfo user = new UserInfo();
        user.setUserName(name);
        user.setUserPwd(pwd);
        Integer userAge = new Integer(age);
        user.setUserAge(userAge);
        user.setEmail(email);

        // 将user对象添加到request对象中
        request.setAttribute("User", user);
        // 将请求转发到logininfo.jsp页面
        request.getRequestDispatcher("logininfo.jsp").forward(request, response);


    }
}