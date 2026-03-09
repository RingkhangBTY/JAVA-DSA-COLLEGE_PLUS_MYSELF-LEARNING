package CODE_CLASS.Array.Searching;

import java.util.Arrays;
import java.util.Scanner;

// https://leetcode.com/problems/binary-search/description/
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,5,9,10,20,32,54};

        System.out.println("Given array: "+Arrays.toString(nums));
        System.out.print("Enter element to search for: ");
        int target = sc.nextInt();
        System.out.println("Target in index: "+binarySearch(nums,target));
    }

    private static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length-1;

        while (start<=end){
//            int mid = (start+end)/2;

            int mid = start + ((end-start)/2);

            if (nums[mid]==target){
                return mid;
            }

            if (nums[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;
    }
}