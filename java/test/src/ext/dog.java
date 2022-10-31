package ext;

/**
 * @ClassName dog
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-27-10-55
 */


public class dog  extends animal{
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }


    @Override
    public void shut() {
        System.out.println("汪汪汪");

    }
}
