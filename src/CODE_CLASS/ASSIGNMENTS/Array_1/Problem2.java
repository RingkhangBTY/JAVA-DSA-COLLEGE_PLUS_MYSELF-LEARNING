package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.
 *
 *
 * Sample Input
 * 9
 * 5 7 9 1 2 4 6 8 3
 * 10
 * Sample Output
 * 1, 2 and 7
 * 1, 3 and 6
 * 1, 4 and 5
 * 2, 3 and 5
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);

//        Brute force way
//        for (int i = 0; i < size; i++) {
//            for (int j = i+1; j <size ; j++) {
//                for (int k = j+1; k < size; k++) {
//                    if (arr[i]+arr[j]+arr[k] == target){
//                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
//                    }
//                }
//            }
//        }

//        more optimized way usage 3 pointer approach
        for (int i = 0; i < size; i++) {
            int j = i+1, k = size-1;

            while (j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if (sum == target){
                    System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                }

                if (sum<target){
                    j++;
                }else {
                    k--;
                }
            }
        }
    }
}
