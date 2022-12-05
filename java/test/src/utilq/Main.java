package utilq;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[args.length];
        for (int i = 0; i < args.length; i++) {

            ints[i]=Integer.parseInt(args[i]);

        }

        puke(ints);
    }


    public static void puke(int arr[]) {

        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
             int j = random.nextInt(i + 1);
            //swap index i, j
             int t = arr[i];
             arr[i] = arr[j];
             arr[j] = t;

        }
    }
}
