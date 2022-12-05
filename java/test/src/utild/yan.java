package utild;

/**
 * @ClassName utild.yan
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-21-14-55
 */


public class yan {

        private static double monteCarlo(int n) {
            int insidePoints = 0;//在圆中的点个数
            int totalPoints = n;//在正方形中点个数
            int R = 100;//圆半径
            for (int i = 0; i < n; i++) {
                int x = (int) (Math.random() * (2 * R));
                int y = (int) (Math.random() * (2 * R));
                if (contain(x, y, R)) {
                    insidePoints++;
                }
            }
            return 4 * 1.0 * insidePoints / totalPoints;
        }

        private static boolean contain(int x, int y, int R) {
            return Math.pow(x - R, 2) + Math.pow(y - R, 2) <= R * R;
        }

        public static void main(String[] args) {
            System.out.println("PI = " + monteCarlo(10000));
            System.out.println("PI = " + monteCarlo(100000));
            System.out.println("PI = " + monteCarlo(1000000));
            System.out.println("PI = " + monteCarlo(10000000));
        }
    }


