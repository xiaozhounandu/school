package demo.xiaozhounandu.www;

import java.util.Arrays;

public class test11 {

public static void main(String[] args) {
        // 定义含有5个元素的数组
        double[] scores = new double[] { 78, 45, 85, 97, 87 };
        System.out.println("排序前数组内容如下：");

        // 对scores数组进行循环遍历
        for (int i = 0; i < scores.length; i++) {
        System.out.print(scores[i] + "\t");
        }
        System.out.println("\n排序后的数组内容如下：");

        // 对数组进行排序
        Arrays.sort(scores);

        // 遍历排序后的数组
        for (double x:scores
             ) {
                System.out.println(x +"\n");
        }
        for (int j = 0; j < scores.length; j++) {
        System.out.print(scores[j] + "\t");
        }
        }
}
