package abs;

/**
 * @ClassName Animal
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-28-15-37
 */


public  class Animal {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shut() {
        System.out.println(name+"叫了一下");
    }
}
