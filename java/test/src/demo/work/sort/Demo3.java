package demo.work.sort;

import java.util.ArrayList;

public class Demo3 {
    //人数
    static final int SIZE =50;
    public static void main(String[] args) {
        //创建相关的List，放入相关的Student
        ArrayList<Student> List = new ArrayList<>();
        //成绩
        int sum=0;
        //循环
        for (int i = 0; i <SIZE ; i++) {

            List.add(new Student(i+1,(int)(Math.random()*61+40)));
            //
            sum+=List.get(i).getScore();
        }
        //平均分
        System.out.println("平均分为："+sum/SIZE);
        //相关的排序
        List.sort((a,b)-> b.getScore()-a.getScore());

        System.out.format("最高分的学号为：%d，分数为：%d",List.get(0).getStiID(),List.get(0).getScore());
    }
}
