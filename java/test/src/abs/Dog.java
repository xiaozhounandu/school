package abs;

public class Dog extends Animal{



    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void shut() {
        System.out.println("汪汪汪");
    }
}
