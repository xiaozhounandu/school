package Test.Ball;

import Test.start.Factroy;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName BallJpanel
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-22-15-39
 */


public class BallJpanel extends JPanel implements Runnable {


    int x = 100;
    int y = 100;
    int d = 100;

    int xDir = 1;
    int yDir = 1;
    int speed = 1;


    Thread t;


    public BallJpanel() {
        this.setBackground(Color.GRAY);
        t = new Thread(this);
        t.start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x, y, d, d );
    }

    @Override
    public void run() {
        while (true) {
            x += speed * xDir;
            y += speed * yDir;

            if (y <= 0 || y >= Factroy.jfHeight - d - 30) {
                yDir *= -1;
            }
            if (x <= 0 || x >= Factroy.jfWidth - d - 15) {
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
}
