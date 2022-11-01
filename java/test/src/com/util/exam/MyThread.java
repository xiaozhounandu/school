package com.util.exam;

/**
 * @ClassName Mythread
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-31-23-12
 */


class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e ){

        }
        System.out.println(Thread.currentThread().getName()+" is closing");
    }



    public static void main(String[] args) {
        Thread t1=new MyThread();


        t1.start();
    }
}
