package CODING_Blocks_5thSem.Array.Revision;

import java.util.Arrays;

public class RevereArray {
    public static void main(String[] args) {
        int[] arr = {12,21,54,78,90};

        reverseArr(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArr(int[] arr) {

        int i = 0, j = arr.length-1;

        while (i<j){
            swap(i,j,arr);

            i++;
            j--;
        }
    }


    private static void swap(int left, int right, int[] arr){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
