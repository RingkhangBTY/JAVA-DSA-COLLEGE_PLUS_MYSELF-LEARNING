package CODE_CLASS.Array.ProblemsOneDArray.SlidingWindow;

// Max length of the subarray whose product is less than 100

public class MaxLengthOfSubarrayProduct {
    public static void main(String[] args) {
        int []arr = {1,2,34,5,4,3,2,25,21,1,2,1,2,21,2};

        int ans = 0;
        int product = 1;
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            product *= arr[j];

            while (product>=100){
                product = product/arr[i];
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        System.out.println(ans);
    }
}