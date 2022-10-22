package abs;

public class Test {
    public static void main(String[] args) {

        Cat cat= new Cat();

        cat.setName("jiao");

        Cat cat1 = new Cat();


        System.out.println(cat);
        cat.shut();

        System.out.println();
        new Dog("小李",20).shut();

        cat1.setName("class");
        cat1.setAge(18);

        System.out.println("当前是"+cat1.getName()+"当前猫1"+cat1.getAge());
        cat1.shut();
    }


}
