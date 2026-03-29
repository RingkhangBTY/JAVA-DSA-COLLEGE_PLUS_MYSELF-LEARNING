package CODE_CLASS.Array.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter "+size+" elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
