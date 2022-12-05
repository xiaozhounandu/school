package simptets;

import java.util.Scanner;

/**
 * @ClassName simptets.addint
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-16-19-26
 */

//编写函数int sum(int x)，求整数x的各位数字之和。
//        在main函数中测试该函数：从键盘输入一非负整数，然后调用sum函数计算各位数字之和并输出结果。
public class addint {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println(SumInt(scanner.nextInt()));
    }
    public static int SumInt(int x){
//        if (x == 0) {
//            return 0;
//        }
//        return SumInt(x / 10) + x % 10;
        int sum = 0;
        while (x >= 10) {
            sum =+ x % 10;
            x /= 10;
        }
        return sum + x;
    }
}
