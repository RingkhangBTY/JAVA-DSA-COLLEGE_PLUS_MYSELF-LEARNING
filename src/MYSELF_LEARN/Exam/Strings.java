package MYSELF_LEARN.Exam;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        s1 = s1.concat(s2);
        System.out.println(s1);

        int [][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[1];



        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
    }
}
