package 二十;

import java.util.Scanner;
import java.util.SplittableRandom;

/**
 * @ClassName newHui
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-09-21-16
 */


public class newHui {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        String str = String.valueOf(nums);
        System.out.println(isPalindrome2(str));
    }

    public static boolean isPalindrome2(String str) {

//捕获异常完成
        String str1 = null;
        try {
            str1 = new StringBuffer(str).reverse().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }


        if(str1.equals(str)){

            return true;
        }
        //</editor-fold>
        return false;
    }

}


