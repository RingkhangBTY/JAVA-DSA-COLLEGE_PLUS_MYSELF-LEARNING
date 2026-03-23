package CODE_CLASS.Array.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.print("Enter "+size+" elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        SelectionSort obj = new SelectionSort();
        obj.sortUsingSelectionSort(arr,size);
        System.out.println(Arrays.toString(arr));

    }

    // Sorting array by using Selection sort
    public void sortUsingSelectionSort(int[]arr,int size){
        for (int i = 0; i < size-1; i++) {
            int minValueIndex = i;

            for (int j = i+1; j <size ; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }

            swap(arr,i,minValueIndex);
        }
    }

    private void swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
