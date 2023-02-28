

import java.util.Scanner;

/**
 * @ClassName huiwen
 * @Description
 * @Author xiaozhounandu
 * @Date
 */


public class huiwen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        String strNum = String.valueOf(nums);
        boolean loop = isLoop(strNum);
        System.out.println(strNum.length());
        System.out.println(loop ? "Bingo" : "Nope");

    }

    public static boolean isLoop(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

//    public static boolean recIsLoop(String str) {
//        if (str.length() < 2) {
//            return true;
//        }
//        if (str.charAt(0) == str.charAt(str.length() - 1)) {
//            return recIsLoop(str.substring(1, str.length() - 1));
//        }
//        return false;
//    }
}

