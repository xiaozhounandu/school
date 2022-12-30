package Test;

import java.awt.*;

import javax.swing.*;


public class starts {
    public static void main(String args[]) {
        // 窗体
        JFrame F = new JFrame();
        F.setTitle("yangNi");
        F.setDefaultCloseOperation(3);
        F.setSize(1000, 1000);
        //设置窗口背景颜色
        MyPanel p = new MyPanel();
        // 增加画布
        F.add(p);

        F.setVisible(true);
    }
}
class MyPanel extends Panel {
    Color c;
    public void paint(Graphics q) {
        for (int i = 0; i < 500; i++) {
        int R=(int)(Math.random()*255);
        int G=(int)(Math.random()*255);
        int B=(int)(Math.random()*255);
        c=new Color(R,G,B);
        q.setColor(c);
        int random =(int)(Math.random()*30);
       System.out.println(random);
         q.setFont(new Font("宋体",Font.BOLD,random));
        this.setBackground(Color.black);
            q.drawString("*", (int)( Math.random()*1000), (int)(Math.random()*1000));
        }
    }
}