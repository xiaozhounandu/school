package com.jie.ReadFile;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import static java.lang.System.in;
import static javafx.scene.input.DataFormat.URL;

/**
 * @author wei zhijie
 * @version 1.0
 * @date 2022/9/6
 */
public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //下载地址
        String realpath="C:\\Intel\\1.jpg";
        System.out.println("下载的文件地址"+realpath);

        //文件的名字
       String fileName= realpath.substring(realpath.lastIndexOf("\\")+1);

        resp.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode(fileName,"utf-8"));

        FileInputStream fileInputStream = new FileInputStream(realpath);
        //创建缓冲区
        int len =0;
        byte[] buffer=new byte[1024];

        ServletOutputStream outputStream = resp.getOutputStream();
        while((len=in.read(buffer))>0){
            outputStream.write(buffer,0,len);
        }
        in.close();
        outputStream.close();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
