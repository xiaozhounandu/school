public class test {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        //for-each遍历二维数组
        for (int[] arr1 : arr) {
            for (int arr2 : arr1) {
                System.out.print(arr2 + "\t");

            }

        }
    }
    }
