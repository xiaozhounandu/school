package com.jie.ReadFile;


import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author wei zhijie
 * @version 1.0
 * @date 2022/9/6
 */
public class Vercode extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("refresh","3");


        //在内存中创建图片

        BufferedImage bufferedImage = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
        //拿到图片
        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();

        //设置图片的背景色
        g.setColor(Color.white);

        g.fillRect(0,0,80,20);

        //给图片写入相关的数据
        g.setColor(Color.red);
        g.setFont(new Font(null,Font.BOLD,20));

        //这个请求用图片打开

        resp.setContentType("image/jpeg");
        //不让浏览器设置相关的缓存
        resp.setDateHeader("expires",-1);
        resp.setHeader("Cache-Control","no-cache");
        resp.setHeader("Pragma","no-cache");



        //把图片写给浏览器

        ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
    }

    //生成随机数
    private String  MakeNum() {
        Random random = new Random();
        String num = random.nextInt(99999) + "";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 7-num.length(); i++) {
            stringBuffer.append("0");

        }
            num=stringBuffer.toString()+num;
        return num;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
