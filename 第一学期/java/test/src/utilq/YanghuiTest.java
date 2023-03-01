package utilq;


import java.util.Scanner;

/**
 * @ClassName Test
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-11-14-03
 */


public class YanghuiTest {

    public static void main(String[] args) {

        textYanghui();
    }
        public static void textYanghui(){

            Scanner sc=new Scanner(System.in);  //创建对象

            int x = sc.nextInt();//接收数据
            int[][] arr=new int[x][x];

            for (int i=0;i<arr.length;i++){

                for (int j=0;j<=i;j++){

                    if (j==0 || j==i){

                        arr[i][j]=1;

                    }else {
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];//该下标上面一个与上面靠做的和
                    }
                    System.out.print(arr[i][j]+"\t"); //输出数字并空格
                }
                System.out.println();
            }
        }

        }



