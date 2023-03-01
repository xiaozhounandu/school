package NewDay;
import lombok.Data;


/**
 * @ClassName Circle
 * @Description
 * @Author weizhijie
 * @Date 2022-11-04-14-54
 */

@Data
//public class Circle  extends Shape implements utils{

    public class Circle implements ShapeInter,  utils{
    private double radius;
    private Point point;

    public Circle(double radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPer() {
        return 2.0*radius*PI;
    }


}
