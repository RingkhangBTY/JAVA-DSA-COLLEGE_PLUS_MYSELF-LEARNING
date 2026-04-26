package CODE_CLASS.Array.ProblemsOneDArray.SlidingWindow;

// Maximum subarray sum
public class MaxLengthSubarraySum {

    public static void main(String[] args) {
        int []arr = {2,3,1,1,1,1,1,4};
        System.out.println(maxLengthOfSubarraySum(arr,5));
    }

    private static int maxLengthOfSubarraySum(int[] arr, int givenSum) {
        int ans = 0;
        int sum = 0;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            while (sum > givenSum) {
                sum -= arr[i];
                i++;
            }

            if (sum == givenSum) {
                ans = Math.max(ans, j - i + 1);
            }
        }

        return ans;
    }
}