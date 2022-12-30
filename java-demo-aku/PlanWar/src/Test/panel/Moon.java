package Test.panel;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class Moon {
    public static void main(String args[]) {
        // 窗体
        JFrame F = new JFrame();
        F.setSize(1366, 768);
        F.setDefaultCloseOperation(3);
        F.setTitle("YangNi");
        //设置窗口背景颜色
        F.setBackground(Color.BLACK);

        MyPanel1 p = new MyPanel1();
        // 增加画布
        F.add(p);
        F.setVisible(true);
    }
}

// 画布类
class MyPanel1 extends Panel {
    public void paint(Graphics q) {
        this.setBackground(Color.black);
        q.setColor(Color.WHITE);
        q.fillOval(300, 100, 100, 100);//画月亮
        q.setColor(Color.white);
        q.fillArc(100,100,100,100,0,360);
        q.setColor(Color.black);
        q.fillArc(140,100,120,120,90,180);
    }
}