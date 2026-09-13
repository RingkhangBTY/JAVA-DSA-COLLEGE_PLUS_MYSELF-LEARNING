package CODING_Blocks_5thSem.Array.Revision;

import java.util.Arrays;

public class ProductOfAnArrayExceptItSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println("Ans: " + Arrays.toString(calculateProduct(nums)));
    }

    private static int[] calculateProduct(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) product *= nums[j];
            }

            ans[i] = product;
        }

        return ans;
    }
}
