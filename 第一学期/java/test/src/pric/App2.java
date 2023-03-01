package pric;

/**
 * @ClassName App2
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-18-08-57
 */

//【问题描述】从命令行输入任意组数值，输出其和。
//        【输入形式】1 2 `3 4 5
//        【输出形式】15.00
//        【样例输入】1 -1  3.1345  11
//        【样例输出】14.13
//        【样例说明】输入数据的个数不限
//        【评分标准]
public class App2 {
    public static void main(String[] args) {
        double sum =0;
      for(String x :args){
          sum += Double.parseDouble(x);
}
        System.out.format("%.2f",sum);

    }


}
