package Test.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName DanmuTest
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-13-16
 */



    public class DanmuTest extends JFrame {

        private static final java.util.List<String> messageList = new ArrayList<>();
        private static final java.util.List<Integer> startPointList = new ArrayList<>();

        public DanmuTest() {
            MovingMessagePanel messagePanel;
            setVisible(true);
            setBounds(100, 100, 800, 600);
            setTitle("xiaozhounandu");
            Font font1 = new Font("微软雅黑", Font.BOLD, 16);
            messagePanel = new MovingMessagePanel(this);
            messagePanel.setFont(font1);
            messagePanel.setOpaque(false);
            Container contentPane = getContentPane();
            contentPane.setLayout(new BorderLayout());
            JTextField textField = new JTextField();
            JPanel jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.add(textField, BorderLayout.NORTH);
            JButton jButton = new JButton("发送");
            jPanel.add(jButton);
            contentPane.add(messagePanel, BorderLayout.CENTER);
            contentPane.add(jPanel, BorderLayout.SOUTH);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = textField.getText();
                    System.out.println("输入的内容：" + text);
                    if (text != null || text != "") {
                        textField.setText("");
                        messageList.add(text);
                        textField.grabFocus();
                    }
                }
            });
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            // 产生随机开始位置与颜色
            crateStartPoints(this);
            Timer timer = new Timer(10, new TimerListener());
            timer.start();
        }

        private void crateStartPoints(DanmuTest danmuTest) {
            Dimension size = danmuTest.getSize();
            int height = (int)size.getHeight();
            for (int i = 20; i < height - 100; i++) {
                startPointList.add(i);
            }
        }

        public static void main(String[] args) {
            new DanmuTest();
        }

        static class MovingMessagePanel extends JPanel {
            private Map<Integer, MessageLocation> map = new HashMap<>();

            private JFrame jFrame;
            private int MAX = 0;
            private int MIN = 0;
            private Random random;
            public MovingMessagePanel(JFrame frame) {
                this.jFrame = frame;
                this.MIN = 0;
                random = new Random(System.currentTimeMillis());
            }

            public void paintComponent(Graphics g) {
                this.MAX = startPointList.size() - 1;
                super.paintComponent(g);// 确保在显示新的图画之前清空视图区域
                int size = messageList.size();
                for (int i = 0; i < size; i++) {
                    String s = messageList.get(i);
                    MessageLocation messageLocation = map.get(i);
                    if (messageLocation == null) {
                        int randNum = random.nextInt(MAX - MIN + 1) + MIN;
                        messageLocation = new MessageLocation(5, startPointList.get(randNum),
                                new Color(random.nextInt(255), random.nextInt(255),random.nextInt(255)));
                        map.put(i, messageLocation);
                    }
                    Integer x = messageLocation.getX();
                    if (x > 1920) {
                        continue;
                    }
                    Integer y = messageLocation.getY();
                    Color color = messageLocation.getColor();
                    g.setColor(color);
                    g.drawString(s, x, y);
                    x += 1;
                    messageLocation.setX(x);
                    map.put(i, messageLocation);
                }
            }

        }

        class TimerListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                System.out.println("重绘");
                repaint();
            }

        }

        static class MessageLocation {
            private Integer x;
            private Integer y;
            private Color color;
            public MessageLocation(Integer x, Integer y, Color color) {
                this.x = x;
                this.y = y;
                this.color = color;
            }

            public Integer getX() {
                return x;
            }

            public void setX(Integer x) {
                this.x = x;
            }

            public Integer getY() {
                return y;
            }

            public void setY(Integer y) {
                this.y = y;
            }

            public Color getColor() {
                return color;
            }
        }


    }



