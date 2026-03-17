package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 * Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.
 *
 * It reads a number N.
 * 2.Take Another N numbers as an input and store them in an Array.
 * Take another number M as an input.
 * If M is found in the Array the index of M is returned else -1 is returned and print the value returned.
 */

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        System.out.print(linerSearch(arr,n,m));
    }

    private static int linerSearch(int[] arr, int n, int m) {
        for (int i = 0; i <n; i++) {
            if (arr[i] == m) return i;
        }

        return -1;
    }
}
