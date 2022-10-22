package demo.xiaozhounandu.cal;

public class Square {
    private double x;
    private double y;

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

    public double getSquareGirth(){
        return 2*(x+y);
    }

    public double getSquareArea(){
        return x*y;
    }
}
