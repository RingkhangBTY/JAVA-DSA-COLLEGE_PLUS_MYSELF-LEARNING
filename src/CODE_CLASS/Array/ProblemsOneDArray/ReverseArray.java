package CODE_CLASS.Array.ProblemsOneDArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        int [] arr = {23,43,12,8,1,43,10};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter "+size+" elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int [] rArr = reverseArr(arr);
        System.out.print("Reversed array: ");
        for (int i: rArr){
            System.out.print(i+" ");
        }
    }

    private static int[] reverseArr(int[] arr) {
        int[] revArr = new int[arr.length];

        int first = 0;
        int last = arr.length-1;
        int i=0;

        while (i<=arr.length/2){
            revArr[first] = arr[last];
            revArr[last] = arr[first] ;

            first ++;
            last--;
            i++;
        }
        return revArr;
    }

}
