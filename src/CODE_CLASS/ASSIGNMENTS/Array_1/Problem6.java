package CODE_CLASS.ASSIGNMENTS.Array_1;

// https://hack.codingblocks.com/app/contests/9550/1003/problem

import java.util.Arrays;
import java.util.Scanner;

/**
 * Deepak has a limited amount of money that he can spend on his girlfriend. So he decides to buy two roses for her.
 * Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount of
 * money on buying roses for her. As he wishes to spend all the money, he should choose a pair of roses whose prices
 * when summed up are equal to the money that he has.
 * Help Deepak choose such a pair of roses for his girlfriend.
 *
 * NOTE: If there are multiple solutions print the solution that minimizes the difference between the prices i and j.
 * After each test case, you mustprint a blank line.
 *
 * Input Format
 * The first line indicates the number of test cases T.
 * Then, in the next line, the number of available roses, N is given.
 * The next line will have N integers, representing the price of each rose, a rose that costs less than 1000001.
 * Then there is another line with an integer M, representing how much money Deepak has.
 * There is a blank line after each test case.
 *
 *
 * Constraints
 * 1≤ T ≤100
 * 2 ≤ N ≤ 10000
 * Price[i]<1000001
 *
 * Output Format
 * For each test case, you must print the message: ‘Deepak should buy roses whose prices are i and j.’, where i and j are
 * the prices of the roses whose sum is equal do M and i ≤ j. You can consider that it is always possible to find a solution.
 * If there are multiple solutions print the solution that minimizes the difference between the prices i and j.
 *
 * Sample Input
 * 2
 * 2
 * 40 40
 * 80
 *
 * 5
 * 10 2 6 8 4
 * 10
 *
 * Sample Output:
 * Deepak should buy roses whose prices are 40 and 40.
 * Deepak should buy roses whose prices are 4 and 6.
 *
 * Explanation
 * Find two such kinds of price of roses which has sum up to equal to Deepak's Money.
 */

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int[] roses = new int[size];

            for (int j = 0; j < size; j++) {
                roses[j] = sc.nextInt();
            }

            int money = sc.nextInt();
            printBestFairOfRoses(roses,money);

            sc.nextLine();
        }
    }

    private static void printBestFairOfRoses(int[] roses, int money) {
        int[] bestPair = new int[2];
//        int rose1,rose2;

        for (int i = 0; i <roses.length; i++) {
            for (int j = i+1; j < roses.length; j++) {
                if (roses[i]+roses[j] == money){

                    if (bestPair[0] == 0){
                        bestPair[0] = roses[i];
                        bestPair[1] = roses[j];
                    }else{
                        bestPair = Math.abs((bestPair[0]-bestPair[1])) < Math.abs((roses[i]-roses[j]))
                                ? bestPair : new int[]{roses[i],roses[j]};
                    }
                }
            }
        }

        System.out.println("Deepak should buy roses whose prices are "+ Math.min(bestPair[0],bestPair[1])+" and "+ Math.max(bestPair[0],bestPair[1]) +".");
    }

    // More optimized solution
    private static void findBestPair(int[] roses, int money) {
        Arrays.sort(roses);

        int left = 0;
        int right = roses.length - 1;

        int bestA = 0, bestB = 0;
        int minDiff = Integer.MAX_VALUE;

        while (left < right) {
            int sum = roses[left] + roses[right];

            if (sum == money) {
                int diff = roses[right] - roses[left];

                if (diff < minDiff) {
                    minDiff = diff;
                    bestA = roses[left];
                    bestB = roses[right];
                }

                left++;
                right--;
            } else if (sum < money) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Deepak should buy roses whose prices are "
                + bestA + " and " + bestB + ".");
    }
}