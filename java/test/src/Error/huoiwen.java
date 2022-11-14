package Error;


import java.util.Scanner;

/**
 * @ClassName huoiwen
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-07-14-01
 */


public class huoiwen {

    public static void main(String[] args) {




        System.out.println(isPalindrome2("131"));
    }

    //数字反转
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }


    public static boolean isPalindrome1(String str) {
        if (str.charAt(0) == str.charAt(str.length()) - 1)
            return isPalindrome1(str.substring(1, str.length() - 1));
        else if (str.length() == 1)
            return true;
        else
            return false;
    }

//
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


//









}