package CODE_CLASS.Array.ProblemsTwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int [][] arr1 = new int[n][n];
        System.out.println("Enter element for array : "+n+" x "+n+" : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target element to search in array: ");
        int target = sc.nextInt();

        System.out.println(
                "Target element found at index : "+
                Arrays.toString(twoDArrayBinarySearch(arr1, target, n))
        );

    }

    static int[] twoDArrayBinarySearch(int [][]arr, int target, int n){

        int row = 0 ;
        int col = n-1;

        while (row<n && col>=0){
            if (arr[row][col] == target ) return new int[]{row,col};

            if (arr[row][col]>target) col --;
            else row ++;
        }

        return new int[]{-1,-1};
    }
}
