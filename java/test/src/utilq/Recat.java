//package 二十;
//
//import lombok.Data;
//
///**
// * @ClassName Recat
// * @Description
// * @Author xiaozhounandu
// * @Date 2022-11-09-22-25
// */
//
//@Data
//public class Recat {
//
//
//    private int length;
//    private int width;
//    private String color;
//    private static int count=0;
//
//
//    public Recat(int length, int width, String color) {
//        this.length = length;
//        this.width = width;
//        this.color = color;
//         ++count;
//    }
//
//    public Recat() {
//        this(10,10,"red");
//    }
//
//
//    public int getArea(int length,int width){
//        return length*width;
//    }
//
//    public  void Info(){
//        System.out.print(" "+this.getLength()+", "+this.getColor()+", "+this.getWidth()+", "+this.getArea(length,width)+";");
//
//    }
//
//
//
//
//
//
//
//    }
//
//    class Test{
//        public static void main(String[] args) {
//            Recat recat = new Recat(10,10,"red");
//            Recat recat1 = new Recat(10,10,"red")+System.out.print(count);
//            recat.Info();
//            recat1.Info();
//
//
//
//        }
//}
