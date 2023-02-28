package prict;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;

/**
 * @ClassName Five
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-16-52
 */

//设计一个类方法，对一个整形数组赋初值，为随机数[1,6]
public class Five {
    public static void main(String[] args) {
     Give(new int[10]);
    }




    public static void Give(int []x){
        x =new int [10];

        for (int i =0;i<x.length;i++){
            Random r=new Random();
            x[i]= r.nextInt(6)+1;
            System.out.println(x[i]);
        }

    }
}
