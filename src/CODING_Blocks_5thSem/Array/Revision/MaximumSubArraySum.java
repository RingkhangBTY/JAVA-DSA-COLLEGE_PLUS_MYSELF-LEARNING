package CODING_Blocks_5thSem.Array.Revision;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSum(nums));
    }

    private static int maxSum(int [] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr){

            sum = sum + num;
            ans = Math.max(ans,sum);

            if (sum<0){
                sum = 0 ;
            }
        }

        return ans;
    }
}
