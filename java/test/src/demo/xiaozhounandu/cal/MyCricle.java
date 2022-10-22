package demo.xiaozhounandu.cal;

import static com.util.Circle.PI;

public class MyCricle {
    //fields

    //private double  x,y;
    private Point p;
    private double  radius;

    //methods
    /*public void setX(double a){
        x=a;

    }
    public void setY(double a){
        y=a;

    }*/



    public void setRadius(double a){
        radius=a;

    }
    /*public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }*/

    public double getArea(){


        return PI*radius*radius;

    }
    public double getCircumference(){
        return 2*PI*radius;
    }


}
