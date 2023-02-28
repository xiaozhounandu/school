package prict;


/**
 * @ClassName Eight
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-16-21
 */
//八、以继承线程类方式实现一个自定义线程，线程每隔若干秒（间隔控制在1到5秒之间）显示字符串"Coding!" ，共显示60次结束，在主方法中进行测试

public class Eight implements Runnable {

    public static void main(String[] args) {
                new Thread(new Eight()).start();


    }


    @Override
    public void run() {
        for (int i = 60; i >0; i--) {

            System.out.println("conding");
            try {

                Thread.sleep((int)(Math.random()*5000+1));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}