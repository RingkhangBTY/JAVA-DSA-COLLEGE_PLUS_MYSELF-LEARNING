package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
        for (int ele : arr) System.out.println(ele);

    }

    private static void reverseArray(int[] arr) {
        int first = 0 , last = arr.length-1;

        while (first<last){
            swapElement(arr,first,last);
            first++;
            last--;
        }
    }

    private static void swapElement(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
