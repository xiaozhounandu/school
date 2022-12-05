package algorithm;

import java.util.Arrays;

/**
 * @ClassName twoSum
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-28-23-41
 */
//给你一个下标从 1 开始的整数数组numbers ，该数组已按 非递减顺序排列 ，请你从数组中找出满足相加之和等于目标数target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
//
//        以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
//
//        你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
//
//        你所设计的解决方案必须只使用常量级的额外空间
//
//        作者：力扣 (LeetCode)
//        链接：https://leetcode.cn/leetbook/read/all-about-array/x9i1x6/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

public class twoSum {
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        System.out.println(Arrays.toString(twoSum1(arr, 13)));

    }

    public static int[] twoSum1(int[] numbers, int target) {
        int numlenth=numbers.length;
        int l=0;
        int r=numlenth-1;
        while (l<r){
            int temp=numbers[l]+numbers[r];
            if (temp == target){
                return new int[]{l+1,r+1};
            }else if(temp<target){
                l++;

            }else if(temp>target){
                r--;
            }
        }

        return null;

    }

}