package CODE_CLASS.Array.Problems;

import java.util.Scanner;

/*
   eg: {1,2,2,3,4} output: true
 */
public class CheckDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isHaveDuplicateElement(arr,n));
        System.out.println(containsDuplicate(arr));
    }


    // this will only work for --> array ranging (1 to N) in a sorted order.
    private static boolean isHaveDuplicateElement(int[] arr, int n) {
        int sum = (n*(n+1))/2;
        int actualSum = 0;

        for (int ele:arr){
            actualSum+=ele;
        }

        return actualSum!=sum;
    }

    // works for any kind of array input.
    private static boolean containsDuplicate(int[] nums){
        sortArr(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }

    private static void sortArr(int[] nums) {
        for (int i = 1; i <nums.length ; i++) {
            int j = i;

            while (j>0 && nums[j]<nums[j-1]){
                swap(nums,j-1,j);
                j--;
            }
        }
    }

    private static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
