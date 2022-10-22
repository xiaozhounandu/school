package x;
import java.util.Random;
import java.util.Scanner;
public class x3 {

        public static void start() {
            Random r = new Random();
            int number = r.nextInt(100) + 1;

            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你要猜的数字:");
                int guessNumber = sc.nextInt();
                if (guessNumber > number) {
                    System.out.println("猜大了！");
                } else if ((guessNumber < number)) {
                    System.out.println("猜小了！");
                } else {
                    System.out.println("猜中了！");
                    break;
                }

            }
        }

    public static void main(String[] args) {

    }
    }







