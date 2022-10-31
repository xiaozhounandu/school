package abs;

/**
 * @ClassName Cat
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-28-15-39
 */


 class Cat extends Animal{
   private   String name;
    class shutanin{
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void shut() {
        System.out.println(name+"叫了一下");;
    }
}
