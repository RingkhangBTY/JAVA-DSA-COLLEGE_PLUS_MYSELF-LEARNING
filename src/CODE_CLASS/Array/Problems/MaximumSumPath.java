package CODE_CLASS.Array.Problems;

// https://hack.codingblocks.com/app/contests/9550/552/problem

public class MaximumSumPath {
    public static void main(String[] args) {
        int[] nums1 = {2,4,5,8,10};
        int[] nums2 = {4,6,8,9};

//        int[] nums1 = {2,3,7,10,12,15,30,34};
//        int[] nums2 = {1,5,7,8,10,15,16,19};

        System.out.println(maxSumPath(nums1,nums2));
    }

    private static int maxSumPath(int[] nums1, int[] nums2) {
        int i=0, j=0;

        int maxSum = 0;
        int sum1 = 0, sum2 = 0;

        while (i<nums1.length && j<nums2.length){
            if (nums1[i]<nums2[j]) {
                sum1 += nums1[i++];
            }else if (nums1[i] >nums2[j]){
                sum2 += nums2[j++];
            }else{
                maxSum += Math.max(sum1,sum2) + nums1[i];

                sum1 = 0 ;
                sum2 = 0;

                i++; j++;
            }
        }

        while (i<nums1.length){
            sum1 += nums1[i++];
        }

        while (j<nums2.length){
            sum2 += nums2[j++];
        }

        return maxSum+Math.max(sum1,sum2);
    }
}
