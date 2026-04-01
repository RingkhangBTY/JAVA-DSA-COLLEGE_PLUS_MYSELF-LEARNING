package CODE_CLASS.Array.ProblemsTwoDArray;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {4,2,2}
        };

        int [][] ans = transpose(arr);

        for (int[] an : ans) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(an[j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;

        int [][]ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
}
