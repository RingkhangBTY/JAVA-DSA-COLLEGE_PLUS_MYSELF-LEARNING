package CODE_CLASS.Array.ProblemsOneDArray;

// Maximum subarray sum
public class variableSlidingWindow {

    public static void main(String[] args) {
        int []arr = {2,3,1,1,1,1,1,4};
        System.out.println(maxLengthOfSubarraySum(arr,5));
    }

    private static int maxLengthOfSubarraySum(int[] arr, int givenSum) {
        int ans = 0 ;
        int sum = 0 ;
        int i=0, j=0;

        while (j<arr.length){
            sum=sum + arr[j];

            if (sum<givenSum){
                j++;
            }else {
                while (sum>givenSum){
                    sum -= arr[i];
                    i++;
                }

                ans = Math.max( ans, j-i+1);
                j++;
            }
        }

        return ans;
    }
}