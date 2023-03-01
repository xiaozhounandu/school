package pric;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName five
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-18-11-15
 */


public class five {
    //编写一个javaGUI 来实现60秒倒计时
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("60秒倒计时");
        frame.setDefaultCloseOperation(3);
        frame.setSize(300, 200);






        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        JLabel label = new JLabel("60秒");
        label.setBounds(10, 10, 200, 30);
        frame.add(label);
        JButton button = new JButton("开始");
        button.setBounds(10, 50, 100, 30);
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread((Runnable) new five()).start();
            }
        });
        frame.setVisible(true);
    }

}
