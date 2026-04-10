package MYSELF_LEARN.TEMP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean []row = new boolean[8];
        row[0] = true;
        System.out.println(Arrays.toString(row));

    }

    private static void print(int [] nums, int target){
        Arrays.sort(nums);
        int i = 0 , j = nums.length-1;
        while (i<j){
            int sum = nums[i] + nums[j];

            if (sum == target) System.out.println(nums[i]+" and "+nums[j]);

            if (sum<target){
                i++;
            }else {
                j++;
            }
        }
    }
}
