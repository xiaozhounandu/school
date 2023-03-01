package demox;

import lombok.Data;

/**
 * @ClassName Son
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-10-40
 */

@Data
public class Son extends Father{
    private int x,y,z;


    public Son(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
