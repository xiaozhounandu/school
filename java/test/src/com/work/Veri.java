package com.work;

import java.util.Scanner;

public class Veri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的年龄");
        int n = sc.nextInt();
        System.out.print("请输入你的性别（男，女）");
        String s = sc.next();
        System.out.print("请输入你的是否有驾照，(输入1表示有驾照，输入0表示没有驾照)");
        int a = sc.nextInt();

        if (n < 19 || s.equals("女") || a == 0) {
            System.out.println("不符合条件");
        }else{
            System.out.println("符合条件");
        }
    }

    }



