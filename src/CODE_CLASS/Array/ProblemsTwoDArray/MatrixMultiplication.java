package CODE_CLASS.Array.ProblemsTwoDArray;

import java.util.Arrays;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int [][]matrix1 = {
                {1,7},
                {2,4},
                {1,2}
        };

        int [][]matrix2 = {
                {3,3},
                {5,2}
        };

        for(int[]ans : calculateMatrixMulti(matrix1,matrix2)){
            for (int ele : ans){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    private static int[][] calculateMatrixMulti(int[][] matrix1, int[][] matrix2) {
        int row_matrix1 = matrix1.length;
        int col_matrix1 = matrix1[0].length;
        
        int row_matrix2 = matrix2.length;
        int col_matrix2 = matrix2[0].length;

        int [][] ansMatrix = new int[row_matrix1][col_matrix2];

        if (col_matrix1 != row_matrix2){
            System.out.println("Can't multiply the matrix: Column of Matrix 1 != Row of Matrix 2");
            for(int []row : ansMatrix){
                Arrays.fill(row,-1);
            }
            return ansMatrix;
        }

        for (int row = 0; row < row_matrix1; row++) {
            for (int col = 0; col < col_matrix2; col++) {
                int ans = 0 ;
                for (int i = 0; i < col_matrix1; i++) {
                    ans += matrix1[row][i] * matrix2[i][col];
                }
                ansMatrix[row][col] = ans;
            }
        }

        return ansMatrix;
    }
}
