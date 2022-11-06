package NewDay;



/**
 * @ClassName TestCircle
 * @Description
 * @Author weizhijie
 * @Date 2022-11-04-14-57
 */

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle(3.0,new Point(0.0,0.0));



        System.out.println("这个圆的周长是\n"+circle.getPer());

        System.out.println("这个圆的面积是\n"+circle.getArea());

    }
}

