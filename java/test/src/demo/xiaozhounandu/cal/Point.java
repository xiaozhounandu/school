package demo.xiaozhounandu.cal;

public class Point {

    /*

     */
    private double  x,y;

    public double getX() {
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
//有参
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
