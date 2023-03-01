package utild;

import java.util.Scanner;

/**
 * @ClassName utild.yanghui
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-21-13-59
 */


public class yanghui {

    public static void main(String[] args) {


       printtriangle(5);

    }

    public static long m(int n) {
        return n==0?1:n*m(n-1);
    }
    public static long binomia(int n,int m){
        return m(n)/(m(n-m)*m(m));
    }
    public static void printtriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.format("%-4d",binomia(i, j));
                System.out.println();
            }
        }

    }
}
