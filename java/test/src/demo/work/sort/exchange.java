package demo.work.sort;


import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
            xcore(99);
    }
     static void xcore(int x){
        //char Xcore(int x){

//        System.out.println("please input your grade:");
//        Scanner s = new Scanner(System.in);//使用Scanner获得键盘输入
//        int grade = s.nextInt();
            int grade = x;
            //char grade='';
            int i;
            i = grade / 10;
            switch (i) {
                case 1:
                case 2:
                    System.out.println("该学生的成绩等级是" + "E");
                   // grade='e';
                    break;
                case 3:
                case 4:
                    System.out.println("该学生的成绩等级是" + "D");
                  //  grade='d';
                    break;
                case 5:
                case 6:
                    System.out.println("该学生的成绩等级是" + "c");
                   // grade='c';
                    break;
                case 7:
                case 8:
                    System.out.println("该学生的成绩等级是" + "B");
                   // grade='b';
                    break;
                case 9:
                case 10:
                    System.out.println("该学生的成绩等级是" + "A");
                    //grade='a';
                    break;
                default:
                    System.out.println("error,please input again!");
                    //return grade;
            }
        }
     }

