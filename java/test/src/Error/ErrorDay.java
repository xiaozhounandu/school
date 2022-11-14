package Error;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ClassName Error
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-07-15-44
 */


public class ErrorDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {

            try {
                Object o = new Object();
                String s= (String)o;
            } catch (ClassCastException e) {
                System.out.println("禁止前进");

                throw new Exception(e);

            }


            int x=scanner.nextInt();
            int y=scanner.nextInt();

            int result=x/y;
        } catch (InputMismatchException e) {

        } catch (ArithmeticException e){


        }catch (Exception e){

        }
    }
}
