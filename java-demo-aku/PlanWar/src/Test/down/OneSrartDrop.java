package Test.down;
//
//import Test.Factroy;
//
//import javax.swing.*;
//import java.awt.*;
//
///**
// * @ClassName OneSrartDrop
// * @Description
// * @Author xiaozhounandu
// * @Date 2022-12-21-11-36
// */
//
//
//public class OneSrartDrop extends JPanel  {
//  // Thread thread;
//   int y;
//
//    public OneSrartDrop(){
//        this.setBackground(Color.BLACK);
//     //   thread= new Thread(this);
//      //  thread.start();
//
//    }
//
//
//    @Override
//    public void paint(Graphics g) {
//        super.paint(g);
//        
//        for (int i = 0; i < 500; i++) {
//        g.setColor(Color.yellow);
//        g.setFont(new Font("宋体",Font.BOLD,10));
//        g.drawString("*",100,y);
//        }
//
//
//
//    }
//
////    @Override
////    public void run() {
////
////        while (true){
////                y++;
////                if(y== Factroy.JfHeight){
////                    y=0;
////
////            }
////
////            repaint();
////            try {
////                Thread.sleep(5);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////        }
//
//   // }
//}


import java.awt.*;

import javax.swing.*;


public class OneSrartDrop extends JPanel implements Runnable {
    int y;

   static int x=1000;
   static int y1=1000;

   Thread t;


   public OneSrartDrop(){
       this.setBackground(Color.BLACK);
       t=new Thread(this);
       t.start();
   }
    public static void main(String args[]) {

        // 窗体
        JFrame F = new JFrame();
        F.setTitle("yangNi");
        F.setDefaultCloseOperation(3);


        F.setSize(x, y1);
        //设置窗口背景颜色
        MyPane p = new MyPane();
        // 增加画布
        F.add(p);

        F.setVisible(true);
    }

    @Override
    public void run() {
        while (true){
            y++;
            if(y== y1){
                y=0;
            }
            repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyPane extends JPanel {
    Color c;
    public void paint(Graphics q) {
        for (int i = 0; i < 500; i++) {
            int R=(int)(Math.random()*255);
            int G=(int)(Math.random()*255);
            int B=(int)(Math.random()*255);
            c=new Color(R,G,B);
            q.setColor(c);
            int random =(int)(Math.random()*30);
            System.out.println(random);
            q.setFont(new Font("宋体",Font.BOLD,random));
            this.setBackground(Color.black);
            q.drawString("*", (int)( Math.random()*1000), (int)(Math.random()*1000));
        }
    }
}