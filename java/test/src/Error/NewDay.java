package Error;



/**
 * @ClassName NewDay
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-08-18-30
 */


public class NewDay extends Thread {
    public static void main(String[] args) {
        Test test = new Test();

//        try {
//            String numString = "1  ";
//            System.out.println(Integer.parseInt(numString));
//            //System.out.println(Integer.parseInt(numString.trim()));
//        } catch (NumberFormatException e) {
//            System.out.println("NumberFormatException problem");
//        }
        Thread thread = new  Thread(test, "1");
        Thread thread1 = new Thread(test, "2");
        Thread thread2 = new Thread(test, "3");

        thread1.start();
        thread.start();
        thread2.start();
    }
}


    class Test implements Runnable {
        private int food = 10;


        @Override
        public void run() {
            while (food > 0) {
                //不加锁出现了资源问题
                synchronized (Test.class){
                if (food > 0) {
                    try {
                            Thread.sleep(-1);
                        } catch(InterruptedException e){
                    } finally {
                        System.out.println("InterruptedException");

                    }
                        food--;
                    } else{
                        System.out.println("没东西吃了");
                        System.exit(0);
                    }
                }
                System.out.println(Thread.currentThread().getName() + "吃饭，吃了：" + food);

            }

        }
    }






