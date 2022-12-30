package Test.start;

import javax.swing.*;

/**
 * @ClassName MyStarPanel
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-12-33
 */

 import java.awt.Color;

import java.awt.Font;

import java.awt.Graphics;

import javax.swing.JPanel;

    /**

     * 画布类

     * 1.继承 JPanel 画布类

     * @author BruceLong

     *

     * */


    public class MyStarPanelx extends JPanel implements Runnable {

// 声明变量数组

        int[] xx = new int[500];

        int[] yy = new int[500];

// 构造方法

        public MyStarPanelx() {

            for (int i = 0;i <500;i++) {

                xx[i] = (int)(Math.random()*800);

                yy[i] = (int)(Math.random()*600);

            }

        }

// 画笔方法

        @Override

        public void paint(Graphics g) {

// TODO Auto-generated method stub

            super.paint(g);

// 2.设置背景颜色

            this.setBackground(Color.BLACK);

//// 6.画月亮 x,y,w,h
//
//            g.setColor(Color.pink);
//
//            g.fillOval(100, 100, 100, 100);
//
//// 7.画月牙
//
//            g.setColor(Color.black);
//
//            g.fillOval(80, 80, 100, 100);

// 3.设置画笔颜色

            g.setColor(Color.yellow);

// 4.设置字体大小

            Font ft = new Font("微软雅黑",Font.BOLD,30);

            g.setFont(ft);

// 5.满天星

            for(int i = 0;i < 500;i++) {



                int R = (int)(Math.random()*255);

                int G = (int)(Math.random()*255);

                int B = (int)(Math.random()*255);

                Color color = new Color(R,G,B);

                g.setColor(color);

                g.drawString("*", xx[i], yy[i]);

            }



        }

        @Override

        public void run() {



            while(true) {


                for(int i = 0;i <500;i++) {

                    int type = (int)(Math.random()*2);

                    if(type ==0) {

                        xx[i]++;

                        yy[i]++;

                    }else{

                        xx[i]--;

                        yy[i]++;

                    }



                    if(xx[i]>800) {

                        xx[i] = 0;

                    }

                    if(yy[i]>600) {

                        yy[i] = 0;

                    }

                }

// 2.调用睡眠方法

                try {

                    Thread.sleep(10);

                } catch (Exception e) {

                    e.printStackTrace();

                }



                repaint();

            }

        }

    }


