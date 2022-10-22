package demo.work;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        master(8);

    }



        //输入月份，判断该月有多少天
       static void master(int month){
            // 读取键盘输入的值
            Scanner s = new Scanner(System.in);
            // 接收
            System.out.println("请输入年份");
            int year = s.nextInt();
//
           int m=month;

            // 条件判断 1,3,5,7,8,10,12月为31天
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
             //   System.out.println(m + "月份有31天");

                // 条件判断 4，6，9，11月为31天
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println(m + "月份有30天");
            } else if (m == 2) {
                //根据年来判断2月份的天数
                if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                    System.out.println(m + "月份有29天");
                } else {
                    System.out.println(m + "月份有28天");
                }
            }else {
                System.out.println("输入的月份不合法");
            }
        }
    }

