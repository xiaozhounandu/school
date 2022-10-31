package demo.circle;

public class MyCircle {
    //fields

    //    private double  x,y;
    private double radius;
    private Point point;

    public double getRadius() {
        return radius;
    }

    public Point getPoint() {
        return point;
    }

//    public void setPoint(Point point) {
//        this.point = point;
//    }
////    public void setPoint(Point p1) {
////        point=p1;
////    }
//
//    public MyCircle(double radius, Point point) {
//        this.radius = radius;
//        this.point = point;
//    }
//methods
//    public void setX(double a){
//        x=a;
//
//    }
//    public void setY(double a){
//        y=a;
//
//    }

    public void setRadius(double a) {
        if(a>0) {
            radius = a;
        }else {
            throw new RuntimeException("输入的数字不规范！");
        }
    }

//
//    }
//    public double getX(){
//        return x;
//    }
//    public double getY(){
//        return y;
//    }

    public double getArea() {

        final double PI = 3.1415926;

        return PI * radius * radius;

    }

    public double getper() {

        final double Px = 3.1415926;

        return Px * 2 * radius;

    }
}

