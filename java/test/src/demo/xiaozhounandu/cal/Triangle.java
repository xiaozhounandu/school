package demo.xiaozhounandu.cal;


import java.util.Scanner;
public class Triangle {
    private double a;
    private double b;
    private double c;
    public double getA(){
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public void setA(double a) {
        this.a=a;
    }
    public void setB(double b) {
        this.b=b;
    }
    public void setC(double c) {
        this.c=c;
    }
    public double getArea() {
        double p;
        p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getperimeter() {
        return a+b+c;
    }
    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入依次输入三个值");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        sc.close();
        Triangle m=new Triangle(a,b,c);
        System.out.println("m的面积是："+m.getArea());
        System.out.println("m的周长是"+m.getperimeter());
    }

}