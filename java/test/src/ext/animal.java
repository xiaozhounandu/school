package ext;

import sun.awt.geom.AreaOp;

/**
 * @ClassName animal
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-27-10-53
 * 继承：
 * 子类继承父类的相关的方法和属性
 * 减少重复代码
 * 子类可以拥有相关的自己的方法
 * 缺点-》只能单继承，这是一个 比较麻烦的问题
 *
 * 接口
 *
 * */



public class animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public animal() {
    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
//aop 动态代理，面向切面编程，
    public void setAge(int age) {
        this.age = age;
    }

    public void shut() {
        System.out.println(name+"叫");
    }
    public void sleep() {
        System.out.println(name+"睡觉");
    }


}