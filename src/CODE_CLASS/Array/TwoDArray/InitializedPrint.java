package CODE_CLASS.Array.TwoDArray;

import java.util.Scanner;

public class InitializedPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int [][]arr = {
                {323,23,23},
                {12,21,21},
                {12,21,21}
        };

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }

        for (int[]nums : arr){
            for (int ele : nums){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
