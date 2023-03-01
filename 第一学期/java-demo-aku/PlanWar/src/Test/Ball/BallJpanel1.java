package Test.Ball;

import Test.Factroy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * @ClassName BallJpanel1
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-22-15-51
 */




    /**
     * @ClassName BallJpanel
     * @Description
     * @Author xiaozhounandu
     * @Date 2022-12-22-15-39
     */


    public class BallJpanel1 extends JPanel implements Runnable , MouseMotionListener {


        int x = 100;
        int y = 100;
        int d = 100;

        int xDir = 1;
        int yDir = 1;
        int speed = 1;


        Thread t;

        //挡板
        int bx=100;
        int by=500;
        int bw=200;
        int bh=20;

        public BallJpanel1() {
            this.setBackground(Color.GRAY);
            t = new Thread(this);
            t.start();
            addMouseMotionListener(this);
        }


        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.red);
            g.fillOval(x, y, d, d );

            g.setColor(Color.BLACK);
            Graphics2D g2=(Graphics2D) g;
            g2.setStroke(new BasicStroke(bh));
            g2.drawLine(bx,by,bx+bw,by);
        }

        @Override
        public void run() {
            while (true) {
                x += speed * xDir;
                y += speed * yDir;

                if (y <= 0) {
                    yDir *= -1;
                }
                if (y <= by - d) {
                    if (x >= bx - d / 2 && x <= bx + bw - d / 2 && y == by - d){
                        yDir *= -1;
                }
            }
            if(x <=0 || x> Factroy.JfWidth -d -15) {
                xDir *= -1;
            }
                repaint();

                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            bx=e.getX() - bw / 2;
        }
    }


