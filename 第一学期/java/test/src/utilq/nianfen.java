package utilq;

/**
 * @ClassName nianfen
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-09-21-07
 */


public class nianfen {

    public static void main(String[] args) {

        for (int i = 2011; i < 2022; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.print(i + " ");

            }
        }
    }
}
