package jie;

import pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author wei zhijie
 * @version 1.0
 * @date 2022/9/6
 *  TM code
 */
public class Session extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        //得到相关的session
        HttpSession session = req.getSession();
        //存东西
        session.setAttribute("name",new Person("魏志杰",1));
        String sessionid = session.getId();


        //判断是不是新创建的session
        if(session.isNew()) {
            resp.getWriter().write("session创建成功,ID" + sessionid);
        }else{
            resp.getWriter().write("session已创建，已创建ID"+sessionid);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
