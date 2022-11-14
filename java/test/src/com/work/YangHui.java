package com.work;

import java.util.Scanner;

public class YangHui {

    static void test() {
        //等边三角形
        int arr1[][] = new int[10][10];
        for (int i = 0; i < arr1.length; i++) {

            //打印杨辉三角数组前的空格
            for (int j = 10; j >= i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    arr1[i][j] = 1;
                else
                    arr1[i][j] = arr1[i - 1][j - 1] + arr1[i - 1][j];

                //调整格式
                System.out.print(arr1[i][j] + "   ");
                if (i == j)
                    System.out.print("\n");
            }
        }
    }

    //数组——杨辉三角_直角三角型
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x=scanner.nextInt();
        //用x控制长度
        int[][] arr = new int[x][x];    //定义二维数组大小
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {   //数组下标从0开始，纵标恒小于等于横标
                if (i == j || j == 0) {   //令i与j相等的位置和第一列的值为1
                    arr[i][j] = 1;
                } else {
                    //arr[i][j]的值为i-1行的第j-1列与第j列值之和
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
              //test();

    }
}

