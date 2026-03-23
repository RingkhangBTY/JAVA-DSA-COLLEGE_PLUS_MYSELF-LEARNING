package MY_PRACTICE.Array;

// https://leetcode.com/problems/number-of-good-pairs/description/

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int pairCount = 0;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j] && i<j){
                    pairCount++;
                }
            }
        }

        String n = "ring";
        int index = 0;

        switch (n){
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        return pairCount;
    }
}