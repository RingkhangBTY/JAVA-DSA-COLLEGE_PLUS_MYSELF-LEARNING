package CODING_Blocks_5thSem.Array.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        printPattern(sc.nextInt());
    }

    private static void printPattern(int n){

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            int num = n -i;

            for (int j = 0; j <= (i+i); j++) {

                if (j == i){
                    System.out.print("0");
                    num--;
                }else if (j < i){
                    System.out.print(num);
                    num++;
                }else {
                    System.out.print(num);
                    num--;
                }
            }

            System.out.println();
        }
    }
}
