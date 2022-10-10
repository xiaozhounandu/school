package com.work.menu;

import java.util.Scanner;

public class MenuUtil {
    public static void main(String[] args) {
      showCustMenu();
    }

    static void showCustMenu() {
        System.out.print("\033[31;4m"+"\t\t电话管理系统主菜单\n\t1.请选择相关的语言[0为英文，1为中文]"+"\033[0m");

        Scanner choice = new Scanner(System.in);
        int ch = choice.nextInt();

        if (ch == 1) {
            System.out.println("进入中文系统");
            login login = new login();
            login.showCustMenu();

        } else if (ch == 0) {
            System.out.println("进入英文系统");
            English english = new English();
            english.showCustMenu1();
        }


    }
}
