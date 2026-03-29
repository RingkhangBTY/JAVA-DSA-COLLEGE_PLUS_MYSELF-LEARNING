package CODE_CLASS.Array.Problems;

import java.util.Arrays;
import java.util.Scanner;

/*
    eg: {1,0,0,1,0,0,1} output: {1,1,1,0,0,0,0}
    --> 1 2 3 --> 3 1 2
 */
public class ReArrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reArrangeArr(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void reArrangeArr(int[] arr,int n) {
        int sum = 0;

        for (int ele:arr){
            sum+=ele;
        }

        for (int i = 0; i < n; i++) {
            if (i<sum){
                arr[i] = 1;
            }else {
                arr[i] = 0;
            }
        }
    }

}
