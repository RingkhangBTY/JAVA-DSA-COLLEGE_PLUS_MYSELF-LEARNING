package MYSELF_LEARN.loops;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = (n/2);
        int star = 1;
        int i = 1;

        while (i<=n){
            //space
            int j = 1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }

            //star
            int k = 1;
            while (k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();

            if (i > n/2){
                star-=2;
                space++;
            }else {
                star +=2;
                space--;
            }
            i++;
        }
    }
}
