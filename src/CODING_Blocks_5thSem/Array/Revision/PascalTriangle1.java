package CODING_Blocks_5thSem.Array.Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle1 {
    public static void main(String[] args) {
        List<List<Integer>> ans = generate(5);

        for (List<Integer> arr: ans){
            System.out.println(Arrays.toString(arr.toArray()));
        }
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> next = new ArrayList<>();
            List<Integer> previous = List.of();

            if (i!=0) {
                previous = ans.get(i-1);
            }
            next.add(1);
            int k = 1;

            for (int j = 0; j < i-1; j++) {
                next.add(previous.get(j) + previous.get(k));
                k++;
            }

            if (i!=0) next.add(1);

            ans.add(next);
        }

        return ans;
    }
}
