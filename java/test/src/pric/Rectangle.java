package pric;

/**
 * @ClassName app4
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-18-09-13
 */
//        【问题描述】
//
//        定义矩形类Rectangle，属性包括长（int） 、宽（int）、颜色（String）和记录矩形个数的静态属性count(int)，编写一个方法，实现输出一个矩形基本信息和面积的功能，定义无参和有参构造方法对属性进行赋值，利用this实现无参构造方法调用有参构造方法。
//
//        编写测试类使用矩形类创建2个矩形类对象，使用构造方法给属性赋值，调用对象的方法输出矩形的基本信息和面积，并输出静态属性count的值,以及第二个实例对象的内存地址。
//
//        【输出形式】
//
//        矩形的颜色，长，宽，面积；矩形的颜色，长，宽，面积；count=2
//
//        第二个实例对象的内存地址

public class Rectangle extends Renter {


    private  int length;
    private int width;
    private String color;
    private static int count=0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static int count (){
        return count;
    }
    @Override
    public int getArea() {

        int area =width* length;
        return area;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        count=++count;
    }

    public void inform(Rectangle r){
        System.out.println(" "+this.width + " "+this.color + " "+this.length );
    }

    public static void main(String[] args) {
        Rectangle red = new Rectangle(1, 1, "red");
        red.inform(red);
    }

}

abstract class Renter{
    public  abstract int getArea();
}
