package abs;
public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void shut() {
        System.out.println("喵喵喵");
    }
}
