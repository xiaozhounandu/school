package com.util.exam;

    //  call  not equals new operation
    public class  Apple{
        private String  name,color;
        private float weight;

        public Apple(){

        }
        public Apple(String name , String color){
            this.name=name;
            this.color=color;
        }
        public Apple(String name , String color,float weight){
//            this.weight=weight;
           this(name,color);
            this.weight=weight;
//            this.name=name;
//            this.color=color;
        }
    }


