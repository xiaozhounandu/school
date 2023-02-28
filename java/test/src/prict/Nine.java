package prict;

/**
 * @ClassName PrintN
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-16-12
 */




public class Nine {

    public static void main(String[] args) throws InterruptedException {


        PrintN();

    }


    public static void  PrintN() throws InterruptedException {

            char daxie = 'A';
            //定义循环，次数26次
            for(int i = 0 ; i < 26 ; i++ ){
                //输出保存字母的变量
                System.out.println(daxie);

                daxie++;
                Thread.sleep(1000);
            }

        }

    }