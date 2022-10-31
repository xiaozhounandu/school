package test;

public class big {

    public static void main(String[] args) {
        //System.out.println(max(1, 3,6));
        System.out.println(max(max(1, 5), 7));
        System.out.println(getGcd(8,4));
    }


    public static int max(int a, int b, int t) {

        //return a > b ? a : (b>t?b:t);

        return max(max(a, b), t);

    }

    public static int max(int a, int b) {

        return a > b ? a : b;

    }

    public static  int getGcd(int n, int m) {
        if (n % m == 0)
            return m;
        else
            return n-m;


    }

}

