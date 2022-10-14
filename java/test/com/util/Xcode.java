package com.util;

/*
@author
 */
public class Xcode {

    //创建静态函数，放入相关的参数
    static char h2f(int score){
        char grade = '0';
        if(score<60)
            grade='E';
        else if(score<70)
            grade='D';
        else if(score<80)
            grade='C';
        else if(score<90)
            grade='B';
        else if(score<100)
            grade='A';
        return grade;

    }

    public static void main(String[] args) {

        System.out.println(h2f(55));

    }
}
