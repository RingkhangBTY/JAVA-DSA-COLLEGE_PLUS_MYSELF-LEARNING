package CODE_CLASS.Array.ProblemsOneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrSir {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = size-1;

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));


    }
}
