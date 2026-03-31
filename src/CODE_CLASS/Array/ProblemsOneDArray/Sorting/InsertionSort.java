package CODE_CLASS.Array.ProblemsOneDArray.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort obj = new InsertionSort();
        obj.sortUsingInsertionSort(arr,size);

        System.out.println(Arrays.toString(arr));
    }

    // Sorting array by using insertion sort
    public void sortUsingInsertionSort(int[] arr, int size){
        for (int i = 1; i <size ; i++) {
            int j = i;

            // 5 3 2 8 9 1  --> 3 5 2 8 9 1 --> 2

            while (j>0 && arr[j]<arr[j-1]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }

    private void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}