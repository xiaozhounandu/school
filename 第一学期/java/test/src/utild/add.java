package utild;

/**
 * @ClassName utild.add
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-21-15-12
 */


public class add {

    public static void main(String[] args) {


            double sum = 0;
            for (String num : args) {
                sum += Double.parseDouble(num);
            }
            System.out.printf("%.2f", sum);
        }
    }


