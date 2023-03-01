package utild;

/**
 * @ClassName utild.yuanzhoul
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-21-14-43
 */


public class yuanzhoul {


    public static double getint(int x){
            int circle =0;
            int total =x;
            int R=100;
        for (int i = 0; i < x; i++) {
            int n=(int)Math.random()*(2*R);
            int y=(int)Math.random()*(2*R);
            if (contain(n, y, R)) {
                circle++;
            }
        }
        return 4 * 1.0 * circle / total;
    }

    private static boolean contain(int n, int y, int R) {
        return Math.pow(n - R, 2) + Math.pow(y - R, 2) <= R * R;
    }

    public static void main(String[] args) {
        System.out.println("PI = " + getint(10000));
        System.out.println("PI = " + getint(100000));
        System.out.println("PI = " + getint(1000000));
        System.out.println("PI = " + getint(10000000));
    }
}
