package Error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName clash
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-09-19-50
 */


public class clash {
    public static void main(String[] args) throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {

//        int sum=0;
//        for (int i = 0; i < args.length; i++)
//            sum+=Integer.parseInt(args[i]);
//        System.out.println("sum"+sum);

        try {
            System.out.println(GetNumber(12, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


    }

    public static int GetNumber(int x, int y) throws ArithmeticException {
        return x / y;
    }


}
