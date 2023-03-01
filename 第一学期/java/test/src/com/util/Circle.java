package com.util;

public class Circle {


    public static final double  PI =3.14;
        private double r;
        /*

         */

    //无参构造
        public Circle(){

            r = 0;

        }
    //有参构造
        public Circle(double _r)

        {

            r = _r;

        }

        public void setR(double R)

        {

            r = R;

        }
//计算长度
        public double getPerimeter() {
            return 2*3.14*PI;

        }
//面积计算
        public double getArea()

        {

            return PI*r*r;

        }

    }

