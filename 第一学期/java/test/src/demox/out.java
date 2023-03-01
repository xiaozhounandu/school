package demox;

/**
 * @ClassName out
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-11-04
 */


public class out {

        class Inner{
            public void foo(){
                System.out.println("iphone 14");
            }
        }

        public void foo1(){
            System.out.println("iphone 14 pro max plus");
        }


        public static void main(String[] age){
//            out n = new out();
//            n.foo1();
//            out.Inner e = n.new Inner();
//
//            e.foo();
           Inner x=new out().new Inner();
           x.foo();




        }
}
