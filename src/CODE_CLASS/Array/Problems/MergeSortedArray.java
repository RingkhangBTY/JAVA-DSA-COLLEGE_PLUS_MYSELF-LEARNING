package CODE_CLASS.Array.Problems;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int []arr1 = {1,2,4,6,7,8,10};
        int []arr2 = {3,5,9};

        System.out.println(Arrays.toString(mergeSortedArray(arr1,arr2)));
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int []ansArr = new int[arr1.length+arr2.length];

        int i=0, j=0;
        int k = 0 ;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i]<arr2[j]){
                ansArr[k] = arr1[i];
                i++;
            }else{
                ansArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // storing rest of array 1 element
        while (i < arr1.length){
            ansArr[k] = arr1[i];
            i++;
            k++;
        }

        // storing rest of array 2 element
        while (j < arr2.length){
            ansArr[k] = arr2[j];
            j++;
            i++;
        }

        return ansArr;
    }
}