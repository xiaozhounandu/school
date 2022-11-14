package IO;

/**
 * @ClassName IOq
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-15-25
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class IOq {


    //File f = new File(this.getClass().getResource("/").getPath());

        public static void main(String[] args) throws IOException {


            String Path="/Users/weizhijie/Desktop/Java-code/school/java/test/src/IO/";

            FileReader inputStream = null;
            FileWriter outputStream = null;

            try {
                inputStream = new FileReader(Path+"xanadu.txt");
                outputStream = new FileWriter(Path+"characteroutput.txt");

                int c;
                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                    System.out.println((char)c);



                }
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        }
    }

