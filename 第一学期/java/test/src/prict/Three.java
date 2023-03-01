package prict;

/**
 * @ClassName Three
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-17-24
 */

// 设计一个类方法，判断一个非负整数是否为质数
public class Three {
    public static void main(String[] args) {
                isPrime(55);
    }


    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}