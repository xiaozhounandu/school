package Test.start;

import java.awt.*;

/**
 * @ClassName Factroy
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-12-21-17-59
 */


public class Factroy {
    public static int width = Toolkit.getDefaultToolkit().getScreenSize().width;

    public static int height = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static int jfWidth = 800;

    public static int jfHeight = 600;

//水平居中x坐标

    public static int jFrameX = width / 2 - jfWidth / 2;//乘直居中y坐标

    public static int jFrameY = height / 2 - jfHeight / 2;

    public static Color randomColor() {

        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);
        return new Color(R, G, B);

    }
    public static Font randomFont(int size) {
        return new Font("宋体", Font.BOLD, (int) (Math.random() * size));
    }


            public static int randomPoint ( int range){
                return (int) (Math.random() * range);
            }
        }
