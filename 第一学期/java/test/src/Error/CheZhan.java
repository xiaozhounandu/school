package Error;

import lombok.SneakyThrows;

public class CheZhan {
    public static void main(String[] args){
        Customer customer = new Customer();

        Thread thread1 = new Thread(customer, "1号乘客：");
        Thread thread2 = new Thread(customer, "2号乘客：");
        Thread thread3 = new Thread(customer, "3号乘客：");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Customer implements Runnable{
    private int tickets = 10;

    @SneakyThrows
    @Override
    public void run() {
        while (tickets > 0){
            synchronized (Customer.class){
                if (tickets > 0){
                    try {
                        Thread.sleep(500);
                   } catch (InterruptedException e) {
                      e.printStackTrace();
                    }
                    tickets--;
                } else {
                    System.out.println("当日票次已售完！！！");
                    System.exit(0);
                }
            }

            System.out.println(Thread.currentThread().getName() + "购票一张，剩余票数：" + tickets);
        }
    }
}