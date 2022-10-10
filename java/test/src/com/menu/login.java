package com.work.menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//@author xiaozhounandu
public class login {


//直接写死账号和密码，密码复用用来计算相关的花费和流量余额
    String name="admin";
    String password="123456";

    vip x=new vip();
    English english=new English();

    public void showCustMenu() {
        System.out.println("\t\t欢迎来到电话管理系统");
            System.out.println("\t\t1.登录系统");
            System.out.println("\t\t2.退出");
            System.out.println("*********************************************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择，输入数字");
            int num =sc.nextInt();
            if(num==1) {
                //调用登录函数，比较输入的密码和自定义的密码是否相同
               showLoginMenu(); //进行登录验证
            }else if(num==2) {
                //调用相关的函数直接退出
                showLoginout();
            }
        }



    /**
     * showMainMenu()主菜单
     * @author xiaozhounandu
     * @version 1.0
     */
    //主菜单
    public void showMainMenu() {
        System.out.println("\t\t电话管理系统主菜单");
        System.out.println("**********************************************************************");
        System.out.println("\t\t1.客户信息管理");
        System.out.println("\t\t2.业务查询");
        System.out.println("**********************************************************************");
        System.out.println("请选择,输入数字或按0返回上一级菜单:");
        Scanner sc =new Scanner(System.in);
        //Shop shop =new Shop();
        int num2 =sc.nextInt();
        if(num2==1) {
            System.out.println("*********************"+x.getName()+"会员详细资料*************************\n");
            System.out.println("\t\t\t用户名:\t"+x.getName());
            System.out.println("\t\t\t密码:\t"+x.getPassword());
            System.out.println("\t\t\t创建时间:\t"+x.getCreateTime());

            //System.out.println(xs.toString());
        }else if(num2==2) {
            //结果为2 展示相关的业务逻辑
            showSendGMenu();
            //结果为1,直接返回初始界面
        }else if(num2 ==0) {
            showCustMenu();
        }

    }

    public void showLoginMenu() {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入用户名:");
        String inputname=sc.next();
        System.out.println("请输入密码");
        String inputpwd=sc.next();
        if(inputname.equals(name) && inputpwd.equals(password)) {
            System.out.println("^-^登录成功^-^ 选择1查看相关的信息后将主动退出相关的业务\n"+"尊贵的:\t"+name+"\t会员\n");
            x.setName(inputname);
            x.setPassword(inputpwd);
            x.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            //	xs.add(x);
            //	System.out.println(xs.toString());

            showMainMenu();

        }else {
            System.out.println("你没有权限进入系统,请重新登录");
            showLoginMenu();
        }

    }

    /**
     * showLoginout 退出
     */
    public void showLoginout() {
        System.out.println("退出系统");
        System.exit(0);
    }


    public void showSendGMenu() {
        //函数循环，如果函数不使用相关的函数退出会一直卡住相关的逻辑层
        while (true) {
        System.out.println("\t\t请选择相关的服务\n" + "**************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t1:查询花费");
        System.out.println("\t\t2:办理套餐");
        System.out.println("\t\t3.流量查询");

        System.out.println("\033[31;4m" + "请选择,输入数字(1-3)或按0结束当前服务返回上一级菜单:" + "\033[0m");
        int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("\033[31;4m" + "\t\t1.欢迎来到查询花费服务" + "\033[0m");
                    System.out.println("您当前的花费为" + (new Integer(password) - 122256));
                    break;
                case 2:
                    System.out.println("\033[43;34;4m" + "\t\t2.欢迎使用办理套餐业务" + "\033[0m");
                    System.out.println("只能输入1-3的数字 ");
                    System.out.println("\t\t1:话费业务办理");
                    System.out.println("\t\t2:流量业务办理");
                    System.out.println("\t\t3.套餐业务办理");
                    Scanner s = new Scanner(System.in);
                    int x = s.nextInt();

                    switch (x){
                        case 1:
                            System.out.println("您当前的话费为" + (new Integer(password) - 123356));
                            System.out.println("话费业务办理成功");
                            System.out.println("您当前的花费为" + (new Integer(password) - 122256));
                            break;
                        case 2:
                            System.out.println("您当前的流量为" + (new Integer(password) - 1237856));
                            System.out.println("流量业务办理成功");
                            System.out.println("您当前的流量为" + (new Integer(password) - 121256));
                            break;
                            case 3:
                            System.out.println("套餐业务办理成功");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\033[32;4m" + "\t\t3.欢迎使用流量查询业务" + "\033[0m");
                    System.out.println("您当前的流量为" + (new Integer(password) - 122256));
                    break;
                case 0:
                    showMainMenu(); //返回主菜单
            }
        }


    }

}
