package utild;

import java.util.Scanner;

/**
 * @ClassName utild.addx
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-23-19-10
 */


public class addx {
    public static void main(String[] args) {
        int[]ints = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            ints[i]= Integer.parseInt(args[i]);

        }
        System.out.println(add(ints));

    }

    public static int add(int []arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
