package MYSELF_LEARN.loops.IMP;

/*
                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1
 */
import java.util.Scanner;
public class HollowDoubleSidedArrow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int spaceOut = n-1, spaceIn=-1;
        int numLeft = 1, numRight=1;
        int i = 1,numCount=1;

        while (i<=n){
            //spaceOUT
            int j =1;
            while (j<=spaceOut){
                System.out.print("  ");
                j++;
            }

            //leftNums
            int k=numCount;
            while (k>=1){
                System.out.print(k+" ");
                k--;
            }

            //spaceInside
            int l=1;
            while (l<=spaceIn){
                System.out.print("  ");
                l++;
            }

            //right nums
            int m=1;
            while (m<=numCount){
                if (i==1 || i==n){
                    m++;
                    break;
                }
                System.out.print(m + " ");
                m++;
            }

            System.out.println();

            if (i>n/2){
                spaceOut+=2;
                spaceIn -=2;
                numCount--;
            }else{
                spaceOut-=2;
                spaceIn+=2;
                numCount++;
            }

            i++;

        }
    }
}
