package CODE_CLASS.Array.Problems;

import java.util.Scanner;

/*
     eg: {1,2,3,5,6}   output:4
 */
public class MissingNoOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Missing element: "+getMissingNo(arr,n));
    }

    private static int getMissingNo(int[] arr,int n) {
        int sum = (n*(n+1))/2;
        int actualSum = 0;
        for (int i : arr){
            actualSum+=i;
        }

//        arr.length

        return sum-actualSum;
    }
}
