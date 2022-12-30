package utilq;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @ClassName TestGui
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-19-15-27
 */
public class Calc02 {
    public static void main(String[] args) {
        new Calculator3().loadFrame();
    }
}

class Calculator3 extends Frame {



    TextField num1, num2, rst;

    public void loadFrame() {
        // 创建控件
        num1 = new TextField(5);
        num2 = new TextField(5);
        rst = new TextField(5);
        Button calc = new Button("=");
        Button clear = new Button("clear");
        clear.setForeground(Color.RED);
        Label plus = new Label("+");

        // 绑定监听器
        calc.addActionListener(new Listener());
        clear.addActionListener(new Clear());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 设为流式布局，添加控件，设置自适应大小及可见性
        setLayout(new FlowLayout());
        setLocation(500, 400);
        add(num1);
        add(plus);
        add(num2);
        add(calc);
        add(rst);
        add(clear);
        pack();
        setVisible(true);
    }

    private class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            rst.setText((n1 + n2) + "");
        }
    }

    private class Clear implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1.setText("");
            num2.setText("");
            rst.setText("");
        }
    }
}
