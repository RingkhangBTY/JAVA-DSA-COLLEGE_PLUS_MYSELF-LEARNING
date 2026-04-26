package CODE_CLASS.Array.ProblemsOneDArray.SlidingWindow;

public class MaxiProductOfSubarrayBtnK {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};

        int k = 3;

        int product = 1;
        for (int i = 0; i < k; i++) {
            product*=arr[i];
        }

        int ans = product;

        for (int i = k; i < arr.length; i++) {
            product = product / arr[i-k];
            product = product * arr[i];

            ans = Math.max(ans,product);
        }

        System.out.println(ans);
    }
}
