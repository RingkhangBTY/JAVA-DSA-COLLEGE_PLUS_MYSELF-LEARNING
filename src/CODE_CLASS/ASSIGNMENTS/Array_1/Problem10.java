package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 * Sort just 0 and 1
 *
 * Input Format
 * A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
 *
 * Constraints
 * N will not exceed 10^7
 *
 * Output Format
 * Sorted Sequence
 *
 * Sample Input
 * 7
 * 1 0 0 1 1 0 1
 * Sample Output
 * 0 0 0 1 1 1 1
 */

// https://hack.codingblocks.com/app/contests/9550/18/problem

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        sortArray(nums);

        for (int ele: nums) System.out.print(ele+" ");
    }

    private static void sortArray(int[] nums) {
        int zeroCount = 0, oneCount = 0 ;

        for (int num : nums) {
            if (num == 0) zeroCount++;
            else oneCount++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i<zeroCount) nums[i] = 0 ;
            else nums[i] = 1;
        }
    }
}
