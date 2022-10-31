package exaPlus;

/**
 * @ClassName Fin
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-28-15-36
 */


public class Test15 {
    public static void main(String[] args) {
        //创建内部类的对象
        shangjin.haishoujisi h=new shangjin().new haishoujisi();
        h.eluoyi();
    }
}
class shangjin{
    public void chuanzhang(){
        System.out.println("这里是外部类方法");
    }
    class haishoujisi{
        public void eluoyi(){
            System.out.println("这里是内部类方法");
        }
    }
}

final class shangjin1{
    public void chuanzhang(){
        System.out.println("这里是外部类方法");
    }
    class haishoujisi{
        public void eluoyi(){
            System.out.println("这里是内部类方法");
        }
    }
}
