package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 * Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array
 *
 * --> Sample Input
 * 5
 * 0 2 4 1 3
 */

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int []ans = inverseArray(arr,n);

        for(int ele:ans){
            System.out.print(ele + " ");
        }
    }

    public static int [] inverseArray(int arr[], int n) {
        int [] ans = new int[n];

        for(int i=0; i<n; i++){
            ans[arr[i]] = i ;
        }

        return ans;
    }
}
