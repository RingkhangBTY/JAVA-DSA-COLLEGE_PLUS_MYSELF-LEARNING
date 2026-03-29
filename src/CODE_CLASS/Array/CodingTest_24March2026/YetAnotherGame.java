package CODE_CLASS.Array.CodingTest_24March2026;

import java.util.Scanner;

/**
 * Yet Another Game problem
 * Monu and Rajesh Bhaiya with their friend Mr Block engaged in a fascinating game involving N items, each
 * item containing a distinct number. The game was simple yet strategically engaging: Monu and Rajesh, the players,
 * took turns selecting an item from either the leftmost or rightmost position in the row.
 * Their objective was to maximize their individual sums of selected item numbers. The players take turns, and Rajesh
 * moves first. During his turn a player can take one item : either the leftmost item in a row or the rightmost one.
 * The game ends when there is no more items .
 * Rajesh and Monu Bhaiya are being greedy. Each of them chooses the item with the larger number during his move.
 * Mr Block  knows which strategy the guys are using, so he wants to determine the final score, given the initial state of the game.
 *
 * Input format
 *
 * First Line contains an integer N i.e. size of the array.
 *
 * Second line contains an integer array .
 *
 * Output format
 *
 * Print their scores. The first number is the number of Rajesh points at the end of the game, the second number is the
 * number of Monu points at the end.
 *
 * Example 1
 *
 * Input
 * 7
 * 1 2 3 4 5 6 7
 * Output
 * 16 12
 *
 *
 * Explanation
 * Rajesh Bhaiya  picks : 1+ 3 +  5 + 7 = 16
 * Monu Bhaiya   picks : 2 + 4 + 6 = 12
 */

// https://codeskiller.codingblocks.com/problems/3619
public class YetAnotherGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }



        int i = 0 , j = size-1, rajeshCount=0,monuCount=0, track = 1;

        while (i<=j){
            if (track == 1){
                if (nums[i]>nums[j]){
                    monuCount += nums[j--];
                }else{
                    monuCount += nums[i++];
                }
                track = 0;
            }else{
                if (nums[i]>nums[j]){
                    rajeshCount += nums[j--];
                }else{
                    rajeshCount += nums[i++];
                }
                track = 1;
            }
        }

        System.out.println(monuCount +" "+rajeshCount);
    }
}