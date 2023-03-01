package utilq;

import java.util.Random;

/**
 * @ClassName change
 * @Description
 * @Author xiaozhounandu
 * @Date 2022-11-17-10-44
 */


    class Solution {
        int[] nums;
        int n;
        Random random = new Random();
        public Solution(int[] _nums) {
            nums = _nums;
            n = nums.length;
        }
        public int[] reset() {
            return nums;
        }
        public int[] shuffle() {
            int[] ans = nums.clone();
            for (int i = 0; i < n; i++) {
                swap(ans, i, i + random.nextInt(n - i));
            }
            return ans;
        }
        void swap(int[] arr, int i, int j) {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }

