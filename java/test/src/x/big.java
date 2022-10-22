package x;


import java.util.Random;
import java.util.Scanner;

public class big {


//        public static void main(String[] args)throws java.io.IOException {
//            int i, s, f = 0;
//            Random random = new Random();
//            i = random.nextInt(100);
//            System.out.println("请输入一个你猜想的数：\n");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            while (true) {
//                s = Integer.parseInt(reader.readLine());
//                f++;
//                if (s>i)    System.out.println("猜大了！\n");
//                if (s<i)    System.out.println("猜小了！\n");
//                if (s==i)
//                {
//                    System.out.println("恭喜你，猜对了！\n");
//                    System.out.println("你总共猜了 "+f+" 次\n");
//                    System.exit(0);
//                }
//                System.out.println("请再次输入一个你猜想的数：\n");
//            }
//        }

public static void test(){
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
        System.out.println(number);

       for (int i = 0; i < 3; i++) {
          // while (i<=3){
        System.out.println("请输入猜的数字【1-100】您有三次机会");
        int guessNumber = scan.nextInt();
        if (guessNumber > number) {
            System.out.println("猜大了。");
            continue;
        } else if (guessNumber < number) {
            System.out.println("猜小了。");
            continue;
        } else {
            System.out.println("恭喜，猜对了。");
            System.exit(0);
        }
        System.exit(0);
    }
      // i++;
}

    public static void main(String[] args) {
        test();
            }
        }











