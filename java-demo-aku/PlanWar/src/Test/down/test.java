



import java.awt.Color;

import java.awt.Frame;

import java.awt.Graphics;

import java.awt.Panel;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;





public class test extends Frame{

//入口函数

    public static void main(String[] args) {

        Frame frame=new Frame("满天星");//创建一个frame

        Panel panel=new MyPanel(); //创建一个panel

        frame.add(panel);//添加panel

        frame.setBackground(Color.BLACK);//设置背景色

        frame.setSize(1024, 768);//设置大小

        frame.setVisible(true);//设置显示

//添加事件监听的关闭事件  内部类



        frame.addWindowListener(new WindowAdapter(){

            @Override

            public void windowClosing(WindowEvent e)

            {

                System.exit(0);

            }});

    }

}

class MyPanel extends Panel{

    public void paint(Graphics g){

        g.setColor(Color.WHITE);

        for(int i=0;i<300;i++){

            g.drawString("*", (int) (Math.random() * 1024),(int) (Math.random() * 768));

           // g.drawString(");

        }

        g.fillOval(800, 100, 100, 100);

        g.setColor(Color.BLACK);

        g.fillOval(780, 80, 100, 100);

    }

}
