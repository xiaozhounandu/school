package prict;

/**
 * @ClassName Four
 * @Description
 * @Author xiaozhounandu
 * @Date 2023-02-13-16-59
 */

//设计一个递归方法，判断一个字符串是否为回文
public class Four {
        public static void main(String[] args) {
            String str="1232";
            System.out.println(HUiwen(str));
        }
        static boolean f(String str) {
            if (str.length() == 1 || str.length() == 0) {   //当字符串的长度尾1或者0的时候是回文返回true
                return true;
            } else if (str.charAt(0) == str.charAt(str.length() - 1)) { //判断字符串头和尾是否相等，相等往下走
                return f(str.substring(1, str.length() - 1));//调用方法判断截取后的字符串，包头不包尾
            }
            return false;   //不满足以上条件则不是回文，返回false

        }


        static boolean HUiwen(String str){
            if (str.length() ==1 ||str.length() ==0){
                return true;
            }else if (str.charAt(0) ==str.charAt(str.length()-1)){
                return HUiwen(str.substring(1,str.length()-1));
            }
            return false;
        }

    }

