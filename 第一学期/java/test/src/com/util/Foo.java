package com.util;

import java.util.Scanner;
/*
回文数
 */

public class Foo {
    public static void main(String[] args) {


        System.out.println("请输入相关的数");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String st1 = x + "";
        StringBuilder st2 = new StringBuilder(st1);

        st2.reverse();
        int count = 0;

        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st2.charAt(i)) {
                System.out.println("不是回文数");
                break;
            } else {
                count++;
            }
        }
        if (count == st1.length()) {
            ;
            System.out.println("回文数");

        }
    }

}

