/**
 * @ClassName Number
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-27-10-12
 */


public class Number {
    public static void main(String[] args) {
        System.out.println(number(500));
        for (int i = 1; i < 100; i++) {
            if(number(i))
                System.out.println(i);

        }
    }

//质数

    public static boolean number(int x) {
        assert (x > 0);//开启断言

        int count = 0;
        for (int i = 1; i <= x; i++)
            if (x % i == 0)
                count++;
        return count == 2 ;

    }
}

//                }
//                    System.out.println("是质数");
//                    return true;
//                } else {
//                    System.out.println("不是质数");
//                }
//            }
//        return 0;
//    }