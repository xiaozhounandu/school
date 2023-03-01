package ceshi;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
        double time, price;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextDouble();
        price = scanner.nextDouble();
        PayMobilePhone payPhone = new PayMobilePhone(time, price);
        System.out.print("Fee="+payPhone.pay());
    }
}

class PayPhone {
    private String code;
}

class PayMobilePhone extends PayPhone implements PayAble {
    private double time;
    private double price;

    public PayMobilePhone(double time, double price) {
        this.time = time;
        this.price = price;
    }

    @Override
    public double pay() {
        return this.time * this.price;
    }
}

interface PayAble {
    double pay();
}

