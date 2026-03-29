package CODE_CLASS.Array.Problems;


// https://leetcode.com/problems/maximum-subarray/description/

public class MaxSumOfASubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {

            sum = sum + num;
            ans = Math.max(sum, ans);

            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}