package IO;

import com.util.Number;
import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

/**
 * @ClassName copy
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-15-39
 */


public class copy {

    public static void main(String[] args) throws IOException {

        writeFile("outagain.txt");

        getRead("outagain.txt");

        show(3211);

    }


    @SneakyThrows
    public static void getRead(String path) {

        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), "UTF-8");

        int len = 0;

        while ((len = inputStreamReader.read()) != -1) {

            System.out.print((char) len);

        }

        inputStreamReader.close();

    }


    @SneakyThrows
    public static void writeFile(String path) {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");

        osw.write("真帅");

        osw.flush();

        osw.close();

    }


    @SneakyThrows

    public static void read(String path) {

        InputStreamReader reader = new InputStreamReader(new FileInputStream(path), "UTF-8");

        int len = 0;
        while ((len = reader.read()) != -1) {
            System.out.println((char) len);
        }
        reader.close();
    }


    @SneakyThrows

    public static void Copy() {


        Files.copy(Paths.get("test.txt"), Paths.get("/"));

    }


    @SneakyThrows
    public static void remove() {
        File file = new File("");
        file.renameTo(new File(""));
    }

    @SneakyThrows
    public static void change() {
        File file = new File("");

    }





    public static void show (int x){
        System.out.println("3211");

        String num= String.valueOf(x);
        System.out.println(num.length());

        int i=x%10;
        int y=x/10%10;
        int z=x/100%10;
        int s=x/1000;
        System.out.println(i+"个位是\n");
        System.out.println(y+"十位是\n");
        System.out.println(z+"百位是\n");
        System.out.println(s+"千位是\n");




    }


}

