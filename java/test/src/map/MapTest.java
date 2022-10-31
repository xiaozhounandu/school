package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-10-24-21-58
 */


public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(1,"jie");
        map.put(2,"jie");
        map.put(3,"jie");
        map.put(4,"jie");
        map.put(5,"jie");
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
            for(Integer key:map.keySet()){
                System.out.println(map.get(key));
            }

//
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//          while (iterator.hasNext()) {
//                  Map.Entry<String, String> entry = iterator.next();
//                  entry.getKey();
//                 entry.getValue();
//              }





    }
}
