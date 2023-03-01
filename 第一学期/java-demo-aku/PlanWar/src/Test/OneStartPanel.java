package Test;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName OneStartPanel
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-20-15-49
 */


public class OneStartPanel extends JPanel {

    int x,y;
    Color c;
        public OneStartPanel(){

            this.setBackground(Color.BLACK);

            x=(int)(Math.random()*Factroy.JfWidth);
            y=(int)(Math.random()*Factroy.JfHeight);
            int R=(int)(Math.random()*255);
            int G=(int)(Math.random()*255);
            int B=(int)(Math.random()*255);
            c=new Color(R,G,B);
        }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(c);
        g.setFont(new Font("宋体",Font.BOLD,65));
        g.drawString("*",x,y);
    }
}
