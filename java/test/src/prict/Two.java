package prict;

/**
 * @ClassName Two
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-17-29
 */

//一、	设计一个递归方法，打印属于N，实现打印N，N-1，……2,1 并测试之
public class Two {
    public static void main(String[] args) {
        printFun(5);
    }


    public static void printFun(int test) {
        if (test < 1)
            return;
        else {
            System.out.printf("%d ", test);
            printFun(test - 1);
            return;
        }

    }
}
