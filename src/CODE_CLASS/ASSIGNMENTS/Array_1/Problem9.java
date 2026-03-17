package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Input Format
 * First line of input contains an integer n representing the length of array n. Next line contains n array elements.
 *
 * Constraints
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums is sorted in non-decreasing order.
 *
 * Output Format
 * A sorted array representing squares of elements of nums array.
 *
 * Sample Input
 * 5
 * -4 -1 0 3 10
 * Sample Output
 * 0 1 9 16 100
 * Explanation
 * After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100]
 */

// https://hack.codingblocks.com/app/contests/9550/1943/problem
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            nums[i] = nums[i]*nums[i];
        }

        Arrays.sort(nums);

        for (int ele : nums) System.out.println(ele);
    }
}
