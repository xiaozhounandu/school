package Trager.Mobile;

import java.util.Scanner;

/**
 * @ClassName test
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-06-20-55
 */


public class test {
    public static void main(String[] args) {
        double time, price;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextDouble();
        price = scanner.nextDouble();
        PayMobilePhone payPhone = new PayMobilePhone(time, price);
        System.out.print("Fee="+payPhone.pay());
    }
    }



