package CODE_CLASS.Array.ProblemsTwoDArray;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int [][]arr = {{323,23,33},{12,45,72},{10,8,27}};
        int n = 3;


        int target = 23;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target ){
                    System.out.println("Element found at index: ["+i+" , "+j+"]");
                }
            }
        }
    }
}
