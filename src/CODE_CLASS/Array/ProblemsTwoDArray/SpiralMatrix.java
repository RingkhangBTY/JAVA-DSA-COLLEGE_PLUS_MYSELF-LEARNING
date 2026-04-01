package CODE_CLASS.Array.ProblemsTwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        List<Integer> ans = spiralOrder(matrix);

        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int top = 0 ;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        int left = 0 ;

        while (top <= bottom && left<=right){

            // add top
            for (int i = left; i <= right; i++) {
                spiral.add(matrix[top][i]);
            }
            top ++;

            // add right
            for (int i = top; i <= bottom; i++) {
                spiral.add(matrix[i][right]);
            }
            right --;

            // add bottom
            if (top<=bottom){
                for (int i = right; i >=left; i--) {
                    spiral.add(matrix[bottom][i]);
                }
                bottom --;
            }

            // add left
            if (left <= right){
                for (int i = bottom; i >=top ; i--) {
                    spiral.add(matrix[i][left]);
                }
                left ++;
            }

        }

        return spiral;
    }
}