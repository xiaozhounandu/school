package demo.util;

public class Recursion {
    public static void main(String[] args){
        long start,end;


        start=System.currentTimeMillis();

        System.out.println(fibnic(35));

        end=System.currentTimeMillis();
        System.out.println("Time overhead is "+(end-start)+ " mills seconds");
    }



    static int  fibnic(int n)
    {
        if(n==0||n==1)

            return 1;

        return fibnic(n-1)+fibnic(n-2);
    }

}
