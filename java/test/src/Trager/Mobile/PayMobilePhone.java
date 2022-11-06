package Trager.Mobile;

/**
 * @ClassName PayMobilePhone
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-06-20-54
 */


public class PayMobilePhone extends PayPhone implements PayAble {
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


