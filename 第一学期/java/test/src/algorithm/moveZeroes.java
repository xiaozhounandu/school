package algorithm;

import java.util.Arrays;

/**
 * @ClassName change0
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-28-23-08
 */


public class moveZeroes {
    public static void main(String[] args) {

        int[] nums = {1, 0, 9, 0, 8, 7, 6, 54, 3};
            move(nums);
            move1(nums);

    }

    public static void move(int [] nums){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] !=0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(i);
        System.out.println(Arrays.toString(nums));
    }


    public static void move1(int []nums){
        int index=0;
        for (int i=0;i<nums.length;i++){
            nums[index++]=nums[i];
        }
        while (index<nums.length){
            nums[index++]=0;
        }
        System.out.println(Arrays.toString(nums));

    }

}
