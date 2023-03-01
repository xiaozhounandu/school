package utild;

/**
 * @ClassName utild.xss
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-16-21-22
 */
//. isSortIntArray
//        【问题描述】从命令行输入一组数值，系统给出反馈，判断数组是否已经排好序（Ascending Style),确认输出为Bingo,否则为Nope.
//        【输入形式】1 3 5 7 9
//        【输出形式】Bingo
//        【样例输入】2 4 6 8 10 0
//        【样例输出】Nope

public class xss {
    public static void main(String[] args) {
        int[] ints = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            ints[i]= Integer.parseInt(args[i]);
        }
        System.out.println(sort(ints)?"Bingo":"Nope");
        }




        public static boolean sort(int[]args){
            for (int i = 1; i <=args.length; i++) {
                if(args[i]>args[i+1]){
                    return false;
                }

            }
            return true;
        }
    }
