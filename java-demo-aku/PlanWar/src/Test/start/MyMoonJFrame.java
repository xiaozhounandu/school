package Test.start;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.RandomAccess;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.WindowConstants;

public class MyMoonJFrame  extends JFrame implements ActionListener {

    // 大小，位置 x,y，移速
    JComboBox<Integer> jComboBox1,jComboBox2,jComboBox3,jComboBox4;
    JPanel jPanel;
    Canvas canvas;
    int x=100,y=100;
    int x1;
    int velocity;
    int size=50 ;
    public MyMoonJFrame() {
        // TODO Auto-generated constructor stub
        this.setSize(1000,500);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        Container container = this.getContentPane();

        jPanel = new JPanel();
        jPanel.setBackground(Color.white);
        jPanel.setSize(1000,50);
        JLabel jLabel1 = new JLabel("大小：");
        JLabel jLabel2 = new JLabel("X坐标：");
        JLabel jLabel3 = new JLabel("Y坐标：");
        JLabel jLabel4 = new JLabel("移速：");

        jComboBox1 = new JComboBox<Integer>();
        for(int i=100;i<1100;i+=100)
        {
            jComboBox1.addItem(i);
        }

        jComboBox1.addActionListener(this);
        jPanel.add(jLabel1);
        jPanel.add(jComboBox1);
        jComboBox2 = new JComboBox<Integer>();
        for(int i = 10; i<500; i+=10)
            jComboBox2.addItem(i);
        jComboBox2.addActionListener(this);
        jPanel.add(jLabel2);
        jPanel.add(jComboBox2);
        jComboBox3 = new JComboBox<Integer>();
        for(int i = 80; i<500; i+=10)
            jComboBox3.addItem(i);
        jComboBox3.addActionListener(this);
        jPanel.add(jLabel3);
        jPanel.add(jComboBox3);

        jComboBox4 = new JComboBox<Integer>();
        for(int i = 10; i<500; i+=10)
            jComboBox4.addItem(i);

        jComboBox4.addActionListener(this);
        jPanel.add(jLabel4);
        jPanel.add(jComboBox4);

        container.add(jPanel);
        // 新建一个Moon类，并且是继承的Canvas类，是在画布上进行操作，可以直接添加到容器中
        Moon moon = new Moon();
        container.add(moon);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new MyMoonJFrame();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() instanceof JComboBox)
        {
            Integer integer = (Integer)jComboBox1.getSelectedItem();
            size = integer;
        }
        if(e.getSource() instanceof JComboBox)
        {
            Integer integer = (Integer)jComboBox2.getSelectedItem();
            x = integer;
            x1 = x+ size/2;
        }
        if(e.getSource() instanceof JComboBox)
        {
            Integer integer = (Integer)jComboBox3.getSelectedItem();
            y = integer;
        }
        if(e.getSource() instanceof JComboBox)
        {
            Integer integer = (Integer)jComboBox4.getSelectedItem();
            velocity = integer;
        }
    }
    //内部类，放在一个类的内部可以使用x,y等一些变量，方便访问，
    class Moon extends Canvas implements Runnable{
        public Moon() {
            // TODO Auto-generated constructor stub
            this.setBackground(Color.black);
            Thread thread = new Thread(this);
            thread.start();
        }
        @Override
        public void paint(Graphics arg0) {
            // TODO Auto-generated method stub
            super.paint(arg0);
            arg0.setColor(Color.white.darker());
            arg0.fillOval(x, y, size, size);
            arg0.setColor(Color.black);
            arg0.fillOval(x1+size/2, y, size, size);
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while(true){

                try {
                    Thread.sleep(velocity);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                repaint();
                x1--;
                if(x1==x-size*3/2)
                    x1=x+size/2;
            }
        }
    }
}


