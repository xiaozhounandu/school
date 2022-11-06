package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @ClassName qwe
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-31-22-36
 */


public class qwe   {
    public static void main(String[] args) {
        int arr []  = {1,2,3,4,5};
        Random r = new Random();
        //循环遍历数组
        for(int i = 0;i<arr.length;i++){
            //生成一个随机索引
            int number = r.nextInt(arr.length);
            System.out.println("当前随机索引是====="+number);
            //拿着随机索引指向的元素与i指向的元素进行交换
            int temp = arr[i];
            System.out.println("当前arr[i]给temp ====="+arr[i]);
            arr[i] = arr[number];
            System.out.println("当前arr[number]给arr[i]====="+arr[number]);
            arr[number] = temp;
            System.out.println("当前tem给arr[number]====="+temp);
        }
        //System.out.println(Arrays.toString(arr));
        for(int i= 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }




    }

}
