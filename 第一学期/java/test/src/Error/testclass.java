package Error;

/**
 * @ClassName test
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-10-10-24
 */


public class testclass {
    public static void main(String[] args) {

//        try {
//            for (int i = 0; i <= args.length; i++) {
//                System.out.println(args[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println();
//        e.printStackTrace();
//
//
//        }

        Exception exception = new Exception();

        // foo(1,2,4,5,5,5,5);

        int sum= 0;
        try {
            sum = 0;
            for (int i = 0; i <= args.length-1; i++) {
                sum+=Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("输入正确的数字格式");;
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("超过数组下标");
            e1.printStackTrace();
        }

        System.out.println("sum="+sum);
    }
    public static void foo(int... args){
        int x=0;
        for (int i = 0; i <args.length ; i++) {
            x+=x;
            System.out.println(x);

        }
    }
}