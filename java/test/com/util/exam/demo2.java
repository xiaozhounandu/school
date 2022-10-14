package com.util.exam;

public class demo2 {


    public static int[] setValues(int[] arr) {
        //需要传值相关的数组进去
       // int [] arr_new=new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            //initialize the array range from 1 to 6
            arr[i] = (int) (Math.random() * 6 + 1);
    }

        return arr;
}

    public static void main(String[] args) {

    setValues(new int[]{1, 10, 10});
    }
}
