package prict;


import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @ClassName Test
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-17-11-29
 */


public class    Demo {
    public static void main(String[] args) throws Exception{
        String path="";
        BufferedInputStream bs=new BufferedInputStream(new FileInputStream(path));


        int len=0;
        byte [] bytes=new byte[1024];


        while ((len = bs.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        bs.close();
   }

}
