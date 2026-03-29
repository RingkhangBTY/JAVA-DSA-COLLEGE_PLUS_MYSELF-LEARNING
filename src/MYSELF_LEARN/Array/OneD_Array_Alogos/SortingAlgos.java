package MYSELF_LEARN.Array.OneD_Array_Alogos;

import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }

        int[] arr1 = {3,4,2,1};
        bubbleSort(arr1);
        System.out.println("Bubble sort: "+ Arrays.toString(arr1));

        int[] arr2 = {3,4,2,1};
        insertionSort(arr2);
        System.out.println("Insertion sort: "+ Arrays.toString(arr2));

        int[] arr3 = {3,4,2,1};
        selectionSort(arr3);
        System.out.println("Selection sort: "+ Arrays.toString(arr3));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            int minValueIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minValueIndex]){
                    minValueIndex = j;
                }
            }
            swap(arr,i,minValueIndex);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;

            while (j>0 && arr[j] < arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }

    private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }


    private static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
