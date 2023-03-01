package Test;

import Test.Ball.BallJpanel1;
import Test.down.OneSrartDrop;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import javax.swing.*;



public class MyNewG extends JFrame {

    public MyNewG(){
        this.setTitle("");
        this.setDefaultCloseOperation(3);
        this.setBounds(Factroy.JFrameX,Factroy.JFrameY,Factroy.JfWidth,Factroy.JfHeight);
       // this.add(new OneStartPanel());
       // this.add(new WhiteStart());
       // this.add(new OneSrartDrop());
        this.add(new BallJpanel1());
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new MyNewG();
    }
}
