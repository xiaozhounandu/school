

import java.util.Scanner;

/**
 * @ClassName xyz
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-09-21-41
 */


public class xyz {
    public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        int result;
        if (x < 0) {
            result = fun();
        } else if (x >= 0 && y < 0) {
            result = fun(x);
        } else if (x >= 0 && y >= 0 && z < 0) {
            result = fun(x, y);
        } else {
            result = fun(x, y, z);
        }
        System.out.println(result);
    }

    public static int fun() {
        return 0;
    }

    public static int fun(int x) {
        return x * x;
    }

    public static int fun(int x, int y) {
        return fun(x) + fun(y);
    }

    public static int fun(int x, int y, int z) {
        return fun(x) + fun(y) + fun(z);
    }
}

