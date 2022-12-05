package simptets;

import java.util.Scanner;



//s=1+(1+2)+(1+2+3)+...+(1+2+3+...+n)。
public class jia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(add(i));
        Sort.main(new String[]{"1","2","3","4"});
    }


    public static int add(int n){

        int s=0;
        for (int i = 1 ; i <= n ; i++)
            for (int j = 1 ; j <= i ; j++)
                s += j;
        return s;

    }
}
