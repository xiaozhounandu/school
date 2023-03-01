package demox;

import lombok.Data;

/**
 * @ClassName Father
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-03-10-40
 */

@Data
public class Father {
    private int x,y;

    public Father() {

        this.x=this.y=0;
    }

    public Father(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
