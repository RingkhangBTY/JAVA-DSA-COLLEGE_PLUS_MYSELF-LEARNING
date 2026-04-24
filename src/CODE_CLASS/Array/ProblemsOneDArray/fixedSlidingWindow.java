package CODE_CLASS.Array.ProblemsOneDArray;

public class fixedSlidingWindow {
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,6,2};

        System.out.println(maxSum(arr,3));

    }

    public static int maxSum(int []arr, int k){

        if (k>arr.length) return -1;

        int sum = 0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int ans = sum;

        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }

//        int i = 0,j=0;
//
//        while (j < arr.length){
//
//            if (j-i + 1 <= k){
//                sum += arr[j];
//                j++;
//            }else{
////                ans = Math.max(ans,sum);
//                sum = sum+arr[j];
//                j++;
//                sum = sum-arr[i];
//                i++;
//            }
//
//            ans=Math.max(ans,sum);
//
////            System.out.println(sum);
//        }

//        System.out.println();

        return ans;
    }
}
