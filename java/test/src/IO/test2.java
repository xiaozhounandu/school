package IO;

/**
 * @ClassName test2
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-15-15
 */




    import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

    public class test2 {
        public static void main(String[] args) throws IOException {

            BufferedReader inputStream = null;
            PrintWriter outputStream = null;

            try {
                inputStream = new BufferedReader(new FileReader("xanadu.txt"));
                outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

                String l;
                while ((l = inputStream.readLine()) != null) {
                    outputStream.println(l);
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

