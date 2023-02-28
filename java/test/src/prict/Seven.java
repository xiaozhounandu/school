package prict;

/**
 * @ClassName Seven
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-16-38
 */


public class Seven {
    public static void main(String[] args) {
        MAx1(1,2,3);

    }


    public static int  Max(int a,int b){
        return Math.max(a, b);
    }


    public static int MAx1(int a,int b,int c){
        System.out.println(Math.max(Max(a, b), c));
        return Math.max(Max(a, b), c);

    }
}
