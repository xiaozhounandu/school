package exaPlus;

import java.util.Scanner;

/**
 * @ClassName demo2
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-28-15-15
 */


public class demo2 {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            String[] strs = line.split(" ");
            int num1 = Integer.parseInt(strs[0]);
            int num2 = Integer.parseInt(strs[1]);

            int max = max(num1, num2);
            System.out.println(max);
        }
        //迭代输出
        public static int max(int a, int b) {
            if (b == 0) {
                return a;
            }
            int min = a > b ? b : a;
            int r1 = a > b ? a % b : b % a;
            return max(min, r1);
        }
    }

