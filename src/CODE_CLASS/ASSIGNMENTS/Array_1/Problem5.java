package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 * Take an input N, the size of array. Take N more inputs and store that in an array. Write a function
 * which returns the maximum value in the array. Print the value returned.
 *
 * 1.It reads a number N.
 * 2.Take Another N numbers as input and store them in an Array.
 * 3.calculate the max value in the array and return that value.
 *
 * N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000
 */

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxArrayElement(arr,size));
    }

    private static int getMaxArrayElement(int[] arr, int size) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i]>max) max = arr[i];
        }

        return max;
    }
}
