package Test.start;

import javax.swing.*;

/**
 * @ClassName ManyStartJFram
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-18-17
 */


public class ManyStartJFram extends JFrame {


    public ManyStartJFram(){
        this.setTitle("xiaozhounandu");
        this.setDefaultCloseOperation(3);
        this.setBounds(Factroy.jFrameX,Factroy.jFrameY,Factroy.jfWidth,Factroy.jfHeight);
        this.add(new ManyStart());
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ManyStartJFram();
    }

}
