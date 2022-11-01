package x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @ClassName qwe
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-31-22-36
 */


public class qwe   {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();


        list.add(1);
        list.add(12);
        list.add(3);
        list.add(5);
        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println();
        }




        list.forEach(s->System.out.println(s));
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println();
            }
        });


        for (Integer integer : list) {
            System.out.println(integer);

        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }



     list.stream().forEach(name-> System.out.println(name));

    }

}
