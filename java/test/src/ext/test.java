package ext;

import java.security.DigestException;

/**
 * @ClassName test
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-27-11-18
 */


public class test {
    public static void main(String[] args) {
        dog dog = new dog("jhudiqwb", 19);

        dog.shut();
        System.out.println(dog);
        dog.setName("gou1");
        dog.setAge(19);
        dog.getName();

        animal a = new dog("jie", 10);
        System.out.println(a.getClass());
        a.sleep();
        a.shut();
        dog dog1 = (dog) a;
        liguanp dog11 = new dog1();
        dog11.shut();
        dog dog12 = new dog();
        dog12.shut();




    }
}
