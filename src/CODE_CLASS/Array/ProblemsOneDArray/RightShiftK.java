package CODE_CLASS.Array.ProblemsOneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter "+size+" elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = size-1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
