package com.work.menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//@author xiaozhounandu
public class English {


    //直接写死账号和密码，密码复用用来计算相关的花费和流量余额
    String name="admin";
    String password="123456";

    vip x=new vip();

    public void showCustMenu1()  {
        System.out.println("English System");
        System.out.println("Loading");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // "\033[31;4m"+"\t\t电话管理系统主菜单\n\t1.请选择相关的语言[0为英文，1为中文]"+"\033[0m"
        System.out.println("\033[31;4m"+"Welcome to Mobile System"+"\033[0m");

            System.out.println("\t\t1.login  ");
            System.out.println("\t\t2.exit");
            System.out.println("*********************************************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("please choice you number");
            int num =sc.nextInt();
            if(num==1) {
                //调用登录函数，比较输入的密码和自定义的密码是否相同
                showLoginMenu1(); //进行登录验证
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
    public void showMainMenu1() {
        System.out.println("\t\tPhone Management Main Menu");
        System.out.println("**********************************************************************");
        System.out.println("\t\t1.Customer Information Management");
        System.out.println("\t\t2.Business inquiries");
        System.out.println("**********************************************************************");
        System.out.println("Please select, enter a number or press 0 to return to the previous menu ");
        Scanner sc =new Scanner(System.in);
        //Shop shop =new Shop();
        int num2 =sc.nextInt();
        if(num2==1) {
            System.out.println("*********************"+x.getName()+"Member Details*************************\n");
            System.out.println("\t\t\tUsername:\t"+x.getName());
            System.out.println("\t\t\tPassword:\t"+x.getPassword());
            System.out.println("\t\t\tCreation Time:\t"+x.getCreateTime());

            //System.out.println(xs.toString());
        }else if(num2==2) {
            //结果为2 展示相关的业务逻辑
            showSendGMenu();
            //结果为1,直接返回初始界面
        }else if(num2 ==0) {
            showCustMenu1();
        }

    }

    public void showLoginMenu1() {
        Scanner sc =new Scanner(System.in);
        System.out.println("user:");
        String inputname=sc.next();
        System.out.println("password");
        String inputpwd=sc.next();
        if(inputname.equals(name) && inputpwd.equals(password)) {
            System.out.println("^-^login Success ^-^ Select 1 to view the relevant information and actively exit the relevant business\n"+"respectful:\t"+name+"\tMember\n");
            x.setName(inputname);
            x.setPassword(inputpwd);
            x.setCreateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            //	xs.utild.add(x);
            //	System.out.println(xs.toString());

            showMainMenu1();

        }else {
            System.out.println("you do not have permission to enter the system, please log back in");
            showLoginMenu1();
        }

    }

    /**
     * showLoginout 退出
     */
    public void showLoginout() {
        System.out.println("exit System");
        System.exit(0);
    }


    public void showSendGMenu() {
        //函数循环，如果函数不使用相关的函数退出会一直卡住相关的逻辑层
        while (true) {
            System.out.println("\t\tchoice Server [only1-3]\n" + "**************************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t1:Phone bill inquiry");
            //话费查询
            System.out.println("\t\t2:Package handling");
            //套餐办理
            System.out.println("\t\t3.Traffic inquiry");
            //流量查询

            System.out.println("\033[31;4m" + "Please select, enter a number (1-3) or press 0 to end the current service to return to the previous menu:" + "\033[0m");
            //请选择,输入数字(1-3)或按0结束当前服务返回上一级菜单
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("\033[31;4m" + "\t\t1.welcome to Phone bill inquiry server" + "\033[0m");
                    //话费查询
                    System.out.println("Your current cost is" + (new Integer(password) - 122256));
                    break;
                case 2:
                    System.out.println("\033[43;34;4m" + "\t\t2.welcome TO Package handling server" + "\033[0m");
                    System.out.println("only 1-3 ");
                    System.out.println("\t\t1:Telephone bill business handling");
                    //话费业务办理
                    System.out.println("\t\t2:Traffic business handling");

                    System.out.println("\t\t3:Package business handling");



                    /*
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

                     */
                    Scanner s = new Scanner(System.in);
                    int x = s.nextInt();


                    switch (x){
                        case 1:
                            System.out.println("Your current cost is" + (new Integer(password) - 123356));
                            System.out.println("Traffic business was successfully handled ");
                            System.out.println("Your current cost is" + (new Integer(password) - 122256));
                            break;
                        case 2:
                            System.out.println("Your current traffic is " + (new Integer(password) - 1237856));
                            System.out.println("Traffic business was successfully handled ");
                            System.out.println("Your current traffic is " + (new Integer(password) - 121256));
                            break;
                        case 3:
                            System.out.println("Package business was successfully handled ");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\033[32;4m" + "\t\t3.Welcome to the traffic query service" + "\033[0m");
                    System.out.println("Your current traffic is" + (new Integer(password) - 122256));
                    break;
                case 0:
                    showMainMenu1(); //返回主菜单
            }
        }


    }

}
