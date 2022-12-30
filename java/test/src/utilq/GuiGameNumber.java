package utilq;

/**
 * @ClassName GuiGameNumber
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-19-15-01
 */
import javax.swing.JOptionPane;

public class GuiGameNumber {

        public static void main (String args[ ]) {

                guess();

        }
        static void guess() {

            System.out.println("给你一个1至100之间的整数,请猜测这个数");
            int realNumber = (int) (Math.random() * 100) + 1;
            System.out.println(realNumber);
            int yourGuess = 0;
            int count = 0;
            while (count < 3) {
                String str = JOptionPane.showInputDialog("输入您的猜测:");
                yourGuess = Integer.parseInt(str);
                while (yourGuess != realNumber) //循环条件
                {
                    count++;
                    if (yourGuess > realNumber) //条件代码
                    {
                        str = JOptionPane.showInputDialog("猜大了,再输入你的猜测:");
                        yourGuess = Integer.parseInt(str);


                    } else if (yourGuess < realNumber) //条件代码
                    {
                        str = JOptionPane.showInputDialog("猜小了,再输入你的猜测:");
                        yourGuess = Integer.parseInt(str);

                    }
                }
                System.out.println("猜对了!");
                System.out.println(count);
                      break;
            }
        }

    }

