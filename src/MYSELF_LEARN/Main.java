package MYSELF_LEARN;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String str = "String first";
//
//        System.out.println(str.length());

//        int input = 12000000;
//
//        int num = Math.abs(input);
//        int revNum = 0;
//
//        while (num>0){
//            int rem = num%10;
//            revNum = revNum*10 + rem;
//            num/=10;
//        }
//
//        if (input<0) revNum *= -1;
//
//        System.out.println(revNum);
//        int i = 0;
//        while (i<6){
//            if (i==2){
//                break;
//            }
//
//            i++;
//        }
//
//        System.out.println(i);

        System.out.println(2/3);

        Random random = new Random();
        System.out.println(random.nextInt());
//        System.out.println();
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
