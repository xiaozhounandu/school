package IO;

/**
 * @ClassName tsatio
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-15-42
 */



import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*;
    public class tsatio {
        public static void main(String[] args) throws IOException {



            Scanner sc =new Scanner(System.in);
            // 指定数据源
            System.out.println("/Users/weizhijie/Desktop/design/text.text");
            String str1 = sc.nextLine();
            File source = new File(str1);

            // 指定目的地
            System.out.println("/Users/weizhijie/Desktop");
            String dest = sc.nextLine();
            copyFile(source,dest);
        }
        public static void copyFile(File source,String dest )throws IOException{
            //创建目的地文件夹
            File destfile = new File(dest);
            if(!destfile.exists()){
                destfile.mkdir();
            }
            //如果source是文件夹，则在目的地址中创建新的文件夹
            if(source.isDirectory()){
                File file = new File(dest+"\\"+source.getName());//用目的地址加上source的文件夹名称，创建新的文件夹
                file.mkdir();
                //得到source文件夹的所有文件及目录
                File[] files = source.listFiles();
                if(files.length==0){
                    return;
                }else{
                    for(int i = 0 ;i<files.length;i++){
                        copyFile(files[i],file.getPath());
                    }
                }

            }
            //source是文件，则用字节输入输出流复制文件
            else if(source.isFile()){
                FileInputStream fis = new FileInputStream(source);
                //创建新的文件，保存复制内容，文件名称与源文件名称一致
                File dfile = new File(dest+"\\"+source.getName());
                if(!dfile.exists()){
                    dfile.createNewFile();
                }

                FileOutputStream fos = new FileOutputStream(dfile);
                // 读写数据
                // 定义数组
                byte[] b = new byte[1024];
                // 定义长度
                int len;
                // 循环读取
                while ((len = fis.read(b))!=-1) {
                    // 写出数据
                    fos.write(b, 0 , len);
                }

                //关闭资源
                fos.close();
                fis.close();

            }
        }
    }


