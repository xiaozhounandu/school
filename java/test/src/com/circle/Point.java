package demo.circle;

public class Point {


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double x,y;

    public Point() {

    }

    public double getX(double v) {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
