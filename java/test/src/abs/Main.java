package abs;


import java.util.Scanner;

/**

  * @Author weizhijie
  * @Date 2022-10-28-15-45
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2.0;
        System.out.format("%10.3f", Math.sqrt(s * (s - a) * (s - b) * (s - c)));

    }
}



