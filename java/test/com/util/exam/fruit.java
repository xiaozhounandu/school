package com.util.exam;

public class fruit {
    // Correct this errors then write down the output
    class Fruit{
        public Fruit(){
            System.out.println("First I'am a fruit");
        }
    }

    class  Apple extends Fruit{
        private String  name,color;
        private float weight;
        public Apple(){
            System.out.println("\nthen i'am an apple ");
        }
        public Apple(String name , String color){
            this.name=name;
            this.color=color;
        }
        public Apple(String name , String color, float weight){

            this(name, color);
            this.weight=weight;
            //将构造函数放在第一行


        }
    }

}
