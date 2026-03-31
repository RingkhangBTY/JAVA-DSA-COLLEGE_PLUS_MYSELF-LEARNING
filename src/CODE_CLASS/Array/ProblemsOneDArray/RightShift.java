package CODE_CLASS.Array.ProblemsOneDArray;

import java.util.Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = arr.length-1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
