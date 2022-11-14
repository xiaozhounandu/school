package IO; /**
 *
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-14-42
 */

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class IoTest {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("./test.text");
            out = new FileOutputStream("./outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);

                System.out.println(c);


            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();

            }
        }
    }
}


