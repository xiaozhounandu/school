package Trager;

import lombok.Data;
import org.omg.CORBA.MARSHAL;

import javax.swing.*;

/**
 * @ClassName Shape
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-10-08
 */

@Data
public abstract class Shape {
//    private double a;
//    private double b;
//    private double c;


//    public static double zhouchang(double a,double b,double c){
//        double zhouchang=a+b+c;
//        System.out.println(zhouchang);
//
//        return zhouchang;
//    }

    abstract double getArea();

    abstract double getLength();







}
