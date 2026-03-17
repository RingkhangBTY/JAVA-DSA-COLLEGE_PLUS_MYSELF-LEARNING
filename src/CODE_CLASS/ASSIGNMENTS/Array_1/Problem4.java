package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 * Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.
 * Sample Input
 * 5
 * 1
 * 3
 * 4
 * 2
 * 5
 * 5
 * Sample Output
 * 1 and 4
 * 2 and 3
 */

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        printPair(arr,target, size);
    }

    private static void printPair(int[] arr, int target, int size) {
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                if (arr[i]+arr[j] == target){
                    System.out.println(
                            Math.min(arr[i],arr[j]) + " and " + Math.max(arr[i], arr[j])
                    );
                }
            }
        }
    }
}
