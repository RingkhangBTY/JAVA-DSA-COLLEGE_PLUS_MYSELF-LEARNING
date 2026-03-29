package MYSELF_LEARN.loops;

/*

 * * * * *
 * *   * *
 *       *
 * *   * *
 * * * * *

 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = (n/2)+1;
        int space = 0;
        int i = 1;

        while (i<=n){
            //Star
            int j = 1;
            while (j<=start){
                System.out.print("* ");
                j++;
            }

            //Space
            int k = 1;
            while (k<space){
                System.out.print("  ");
                k++;
            }

            //Star
            int l = 1;
            while (l<=start){
                if (l== (n/2)+1 ) break;
                System.out.print("* ");
                l++;
            }

            System.out.println();

            if (i>(n/2)){
                start ++;
                space -=2;
            }else {
                start --;
                space +=2;
            }

            i++;
        }
    }
}