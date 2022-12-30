package shixun;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName windows
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-19-16-36
 */


public class Windows {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("xiaozhounandu");
        jFrame.setSize(400, 600);

        JMenuBar menuBar = new JMenuBar();
        JMenu jMenu = new JMenu("file");
        JMenuItem jMenuItem1 = new JMenuItem("close1");
        JMenuItem jMenuItem2 = new JMenuItem("close2");
        JMenuItem jMenuItem3 = new JMenuItem("close3");


        JMenu jMenu1 = new JMenu("new");
        JMenuItem jMenuItem4 = new JMenuItem("shutdown");

        jMenu1.add(jMenuItem4);

        jMenu.add(jMenuItem1);
        jMenu.add(jMenuItem2);
        jMenu.addSeparator();
        jMenu.add(jMenuItem3);

        menuBar.add(jMenu);
        menuBar.add(jMenu1);


        jFrame.setJMenuBar(menuBar);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认是三
        jFrame.setVisible(true);

    }
}
