package CODE_CLASS.Array.ProblemsOneDArray;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftOptimized {

    int[] nArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        RightShiftOptimized obj = new RightShiftOptimized();
        obj.rotate(arr,k);
    }

    public void rotate(int []arr, int k) {
        nArr = arr;
        int n = nArr.length;
        k = k%n; // avoid array index out of bound exception

        reverse(0,n-1); // O(n)
        reverse(0,k-1); // O(k)
        reverse(k,n-1); // O(n-k)

        System.out.println(Arrays.toString(nArr));
    }

    private void reverse (int s, int e){
        while (s<e){
            int temp = nArr[s];
            nArr[s] = nArr[e];
            nArr[e] = temp;

            s ++;
            e --;
        }
    }
}
