package Test.start;

/**
 * @ClassName MyStar
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-12-32
 */



import javax.swing.JFrame;





    public class MyStar {

        public static void main(String[] args) {

            JFrame frame = new JFrame();

            MyStarPanelx panel =new MyStarPanelx();

            frame.add(panel);

            Thread t = new Thread(panel);

            t.start();

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setTitle("xiaozhounandu");

            frame.setSize(800, 600);

            frame.setLocationRelativeTo(null);

            frame.setVisible(true);


        }

    }


