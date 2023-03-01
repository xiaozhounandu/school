package pric;

import java.util.Scanner;

/**
 * @ClassName app3
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-18-09-02
 */

/*键盘输入一个1-99999之间的数，程序计算出该数字为几位数，并且判断该数是否是回文数
.回文数值得是该数逆序排列后得到的数和原数相同。例如12212，3223 都是回文数。*/
public class app3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
    }
    public static boolean huiwen(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(0) != str.charAt(str.length() - i - 1)) {

                return false;
            }
        }
        return true;
    }
}