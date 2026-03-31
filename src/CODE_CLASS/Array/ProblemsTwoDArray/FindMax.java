package CODE_CLASS.Array.ProblemsTwoDArray;

public class FindMax {
    public static void main(String[] args) {
        int [][]arr = {{323,23,23},{12,21,21},{12,21,21}};
        int n = 3;
        int max = arr[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }

        System.out.println(max);
    }
}
