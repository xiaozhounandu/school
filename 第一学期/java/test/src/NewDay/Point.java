package NewDay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description
 * @Author weizhijie
 * @Date 2022-11-04-14-50
 */

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Point {
    private double x,y;


    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
