package utilq;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName GameNumber
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-19-14-55
 */


public class GameNumber {

        public static void main(String[] args) {
            Random random = new Random();
            int i = random.nextInt(100);//随机数1~100之间,在循环之外大小不会改变了
            Scanner scanner = new Scanner(System.in);
            System.out.println(i);
            int count = 0;//加一个计数器，增加趣味性
            System.out.println("欢迎参加猜数字游戏，请猜出数字大小");
            System.out.println("请输入0~100之间的数");
            System.out.println("您只有五次机会");
            while (count<5) {
                int player = scanner.nextInt();//玩家猜数字
                System.out.println(player);
                if (player >i) {
                    System.out.println("您猜的数字大了");
                    count++;
                } else if (player < i) {
                    System.out.println("您猜的数字小了");
                    count++;
                } else if (player == i) {
                    System.out.println("您猜对了");
                    break;
                }
            }
            System.out.println("game over");
        }
    }

