package 二十;

import javax.net.ssl.SSLSessionContext;
import java.util.Scanner;

/**
 * @ClassName Exchange
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-09-20-56
 */


public class Exchange {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        exchange(x,y);

    }


    public static void exchange(int x, int y) {

        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);


    }

}