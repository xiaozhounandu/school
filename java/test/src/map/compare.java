package map;

/**
 * @ClassName compare
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-25-08-58
 */


public class compare  {
    public static void main(String[] args) {
        // min->max
        Integer[] intArray = {new Integer(2),new Integer(4),new Integer(3)};

        Double[] doubleArray = {new Double(3.4),new Double(1.3),new Double(-22.1)};
        //J 74    a 97    r 114
        Character[] charArray = {new Character('a'),new Character('J'),new Character('r')};

        Long [] longs ={new Long(99),new Long(100),new Long(251)};

        //比较字符串的每一位
        String[] stringArray = {"Tom","Susan","Kim"};




        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        sort(longs);


        System.out.print("Sorted Integer objects: "+"\n");
        printList(intArray);
        System.out.print("Sorted Double objects: "+"\n");
        printList(doubleArray);
        System.out.print("Sorted Char objects: "+"\n");
        printList(charArray);
        System.out.print("Sorted String objects: "+"\n");
        printList(stringArray);
        System.out.print("Sorted long object: "+"\n");
        printList(longs);
    }



    public static <E extends Comparable<E> > void sort(E[] list){
        E min;
        int index;
        for (int i = 0; i < list.length-1; i++) {
            min=list[i];
            index=i;
            for (int j = i+1; j < list.length; j++) {
                if(min.compareTo(list[j])>0){
                    min=list[j];
                    index=j;
                }
            }
            if(index  != i){

                list[index]=list[i];
                list[i]=min;

            }
        }

    }

    public static void printList(Object[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+"  "+"\n");


        }

    }
}
