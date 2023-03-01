package Test.down;

/**
 * @ClassName w
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-11-49
 */

//300个星星下落
import java.awt.*;
public class Ball100 {
    public static void main(String[] args){
        Frame w=new Frame();
        w.setSize(1366, 768);
        w.setBackground(Color.BLACK);
        w.setVisible(true);
        MyPanel mp =new MyPanel();
        mp.aa();
        w.add(mp);
        Thread t=new Thread(mp);
        t.start();
    }
}
class MyPanel extends Panel implements Runnable{
    int a[]=new int[300];
    int b[]=new int[300];
    public void aa(){
        for(int i=0;i<300;i++){
            a[i] = (int)(Math.random()*1366);
            b[i] = (int)(Math.random()*768);
        }
    }
    public void paint(Graphics g){
        for(int i=0;i<300;i++){
            g.setColor(Color.YELLOW);
            g.drawString("☆", a[i], b[i]);
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i=0;
        while(true){
            for(i=0;i<300;i++){
                b[i]++;
                if(b[i]>768){
                    b[i]=0;
                }
            }
            try{
                Thread.sleep(5);
            }catch(Exception e){

            }
            repaint();
        }
    }
}