package Test;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName MySecondJFram
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-20-10-44
 */


public class MySecondJFram {

   JFrame jFrame= new JFrame();


    public MySecondJFram(){
        jFrame.setTitle("xiaozhounandu");

        //默认也可以为三
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        int width= Toolkit.getDefaultToolkit().getScreenSize().width;

        int height= Toolkit.getDefaultToolkit().getScreenSize().height;

        int jfWidth=400;
        int jfHight=600;
        int jFramX=width/2-jfWidth/2;
        int jFramy=height/2-jfHight/2;

        jFrame.setBounds(jFramX,jFramy,jfWidth,jfHight);
        jFrame.setVisible(true);






    }

    public static void main(String[] args) {
        new MySecondJFram();
    }
}
