package map;

/**
 * @ClassName testFab
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-24-11-17
 */


public class testFab {
    public static void main(String[] args) {
     String [] name={"jie","jie1","jie2","jie3","jie4","jie5"};

        for (int i = 0; i < name.length/2; i++) {
            mySwap(name,i, name.length-1-i);
        }
        for (String x:name){
            System.out.println(x);
        }

        int [] data={};
        for (int i = 0; i < data.length/2; i++) {
            mySwap(name,i, name.length-1-i);
        }
        for (Integer y:data){
            System.out.println(y);
            System.out.println(y);
        }
    }

    public static<T> void mySwap(T[] arr,int i,int j){
        T temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
