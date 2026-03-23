package MY_PRACTICE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int x = 1534236469;
//        long a = x * 10L;
//        Integer.MAX_VALUE
        int[] ans ={1,2,3,4};

        int len = ans.length/2;
        System.out.println(len);

        double m = (double) (ans[len] + ans[len - 1]) /2;

        System.out.println(m);
        System.out.println(m/2);

        System.out.println();
    }



    public static boolean containsDuplicate(int[] nums) {
//        if (nums.length == 1){
//            return false;
//        }
//        int sum = (nums.length*(nums.length+1))/2;
//        int actualSum = 0;
//
//        for(int ele : nums){
//            actualSum +=ele;
//        }
//
//        return sum>actualSum;
        int num = nums[0];
        for (int i = 1; i <nums.length ; i++) {
//            if (num)
        }
        return false;
    }
}
