package demox;

import lombok.Data;

/**
 * @ClassName Teac
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-10-56
 */

@Data
public class Teac {
    private String name;
    private int age;
    private String xy;

    public Teac(String name) {
        this(name,"男");
        System.out.println("");
    }


    public Teac(String name, String xy) {

    }

    public Teac(String name, String xy,int age) {

        this.name=name;
        this.age=age;
        this.xy=xy;
        System.out.println("three");
    }
}
