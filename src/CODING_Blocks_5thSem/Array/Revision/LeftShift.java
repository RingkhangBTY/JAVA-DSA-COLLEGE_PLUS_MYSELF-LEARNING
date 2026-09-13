package CODING_Blocks_5thSem.Array.Revision;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        leftShift(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void leftShift(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}