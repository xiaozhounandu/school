package Test.start;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName ManyStart
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-17-54
 */


public class ManyStart extends JPanel implements Runnable {

    int[] x;
    int[] y;
    Thread t;


    public ManyStart() {
        this.setBackground(Color.BLACK);

        x = new int[500];
        y = new int[500];
        for (int i = 0; i < x.length; i++) {
            x[i] = Factroy.randomPoint(Factroy.jfWidth);
            y[i] = Factroy.randomPoint(Factroy.jfHeight);
        }
            t = new Thread(this);//实例化线程对象t
            t.start();//线程启动

        }

       @Override
        public void paint(Graphics g){
            super.paint(g);
            for (int i = 0; i < x.length; i++) {
                g.setColor(Factroy.randomColor());
                g.setFont(Factroy.randomFont(30));
                g.drawString("*", x[i], y[i]);
            }
        }

        public void run () {

            while (true) {

                for (int i = 0; i < x.length; i++) {
                        y[i]++;
                    if (y[i] == Factroy.jfHeight) {//判断每一颗星是 否到达窗体的底部 y[i] = 0;
                        y[i] = 0;
                        }
                    }
                        repaint();

                        try {

                            Thread.sleep(5);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }




