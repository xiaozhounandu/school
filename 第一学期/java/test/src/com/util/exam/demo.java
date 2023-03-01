package com.util.exam;

import java.util.Random;

public class demo {
    //
    public static <T> void swap() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Random r = new Random();
        Integer[] test = new Integer[20];
        for (int i = 0; i < 20; i++) {
            test[i] = r.nextInt(60);
        }

        for (int i = 0; i < 10; i++) {
            //要求提供
            swap(test, i,test.length-1-i);
        }
    }
}
