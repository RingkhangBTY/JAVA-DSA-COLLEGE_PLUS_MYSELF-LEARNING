package CODE_CLASS.Array.Problems;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,7,11,13};
        int target = 24;

        System.out.println(
                Arrays.toString(findTwoSum(nums,target))
        );
    }

    private static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
//                Math.max()
            }
        }


        return new int[]{-1,-1};
    }
}
