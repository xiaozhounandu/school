package shixun;

/**
 * @ClassName Persion
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-19-16-12
 */


public class Persion {

    private String name;
   private int age;

    public Persion(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private double salary;






    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public Persion dance(){
        System.out.println("dance=======");
        return null;
    }



    public Persion show(){
        System.out.println("name"+name);

        System.out.println("age"+age);

        System.out.println("salary"+salary);
        return null;
    }

}
