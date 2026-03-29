package MYSELF_LEARN.loops;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int space = n-1;

        while (i<=n){

            //space
            int j = 1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //nums
            int k = 1 ;
            int nums = i;
            while (k<=(i*2)-1){
                System.out.print(nums+" ");
                if (k>=i){
                    nums--;
                }else {
                    nums++;
                }
                k++;
            }

            System.out.println();

            space--;
            i++;
        }
    }
}
