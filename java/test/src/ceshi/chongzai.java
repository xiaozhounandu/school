package ceshi;

import java.util.Scanner;

public class chongzai {
	public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
 
        int result;
        if (x < 0) {
            result = f();
        } else if (x >= 0 && y < 0) {
            result = f(x);
        } else if (x >= 0 && y >= 0 && z < 0) {
            result = f(x, y);
        } else {
            result = f(x, y, z);
        }
        System.out.println(result);
    }
 
    public static int f() {
        return 0;
    }
 
    public static int f(int x) {
        return x * x;
    }
 
    public static int f(int x, int y) {
        return x * x + y * y;
    }
 
    public static int f(int x, int y, int z) {
        return x * x + y * y + z * z;
    }
}

