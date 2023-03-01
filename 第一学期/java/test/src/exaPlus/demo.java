package exaPlus;

import java.util.Scanner;

/**
 * @ClassName demo
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-28-14-01
 */

//
//从键盘输入两个整数，并求这两个数的最大公约数
//
//        提示：使用辗转相除法来求，例如12和18两个数，先用18除以12，余数为6，然后再用12除以6，余数为0，所以，最大公约数就是6.
//        【输入形式】
//
//        从键盘输入两个整数，两个整数用空格隔开
//
//        【输出形式】
//
//        输出两个整数的最大公约数
//
//        【样例输入】

public class demo {

    public static void main(String[] args) {

        System.out.println("请输入两个相关的值");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(Max(n, m));

    }

    public static  int Max(int a, int b) {

        if (a < b) {
            int tem = a;
            a = b;
            b = tem;
        }
        if (b == 0) {
            return a;
        } else {
            return Max(b, a % b);
        }
    }
}