package prict;

/**
 * @ClassName One
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-17-32
 */
//设计一个递归方法，打印属于N，实现打印N，N-1，…….2,1，2,…..N-1, N并测试之。

public class One {
    public static void main(String[] args) {
print(5);
    }



    public static void print (int x){
        System.out.println(x);
        if (x == 1 )
            return;
        print(x-1);
        System.out.println(x);


    }
}
