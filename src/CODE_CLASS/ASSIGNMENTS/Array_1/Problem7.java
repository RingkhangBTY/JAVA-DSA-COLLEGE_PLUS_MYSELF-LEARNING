package CODE_CLASS.ASSIGNMENTS.Array_1;

import java.util.Scanner;

/**
 *Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws. The city has n rickshaws and
 * m cabs, the rickshaws are numbered by integers from 1 to n, the cabs are numbered by integers from 1 to m.
 *
 * Public transport is not free. There are 4 types of tickets:
 *
 * A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
 * A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
 * A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
 * A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.
 *
 * Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked
 * you for help to find the minimum sum of ruppees he will have to spend on the tickets.
 *
 *
 * Input Format
 * Each Test case has 4 lines which are as follows:
 *
 * The first line contains four integers c1,c2,c3,c4 (1≤c1,c2,c3,c4≤1000) — the costs of the tickets.
 * The second line contains two integers n and m (1≤n,m≤1000) — the number of rickshaws and cabs Ramu is going to use.
 * The third line contains n integers ai (0≤ai≤1000) — the number of times Ramu is going to use the rickshaw number i.
 * The fourth line contains m integers bi (0≤bi≤1000) — the number of times Ramu is going to use the cab number i.
 */

/* https://hack.codingblocks.com/app/contests/9550/1089/problem

2
1 3 7 19
2 3
2 5
4 4 4
4 3 2 1
1 3
798
1 2 3

   For the first testcase ,
The total cost of rickshaws = min( min(2 * 1, 3) + min(5 * 1, 3), 7) = min(5, 7) = 5
The total cost of cabs = min( min(4 * 1, 3) + min(4 * 1, 3) + min(4 * 1, 3) , 7) = min ( 9, 7) = 7
Total final cost = min( totalCabCost + totalRickshawCost , c4) = min( 5 + 7, 19) = min ( 12, 19) = 12
We print 12.
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            int[] ticketPrice = new int[4];
            for (int i = 0; i < ticketPrice.length; i++) {
                ticketPrice[i] = sc.nextInt();
            }
            int[] noOfRickshawAndCab = new int[2];
            for (int i = 0; i < noOfRickshawAndCab.length; i++) {
                noOfRickshawAndCab[i] = sc.nextInt();
            }

            int[] rickshawUsage = new int[noOfRickshawAndCab[0]];
            for (int i = 0; i < rickshawUsage.length; i++) {
                rickshawUsage[i] = sc.nextInt();
            }

            int[] capUsage = new int[noOfRickshawAndCab[1]];
            for (int i = 0; i < capUsage.length; i++) {
                capUsage[i] = sc.nextInt();
            }

            int rickshawPrice = getMinRickshawCost(ticketPrice,rickshawUsage);
            int capPice = getMinCapCost(ticketPrice,capUsage);

            int totalMinCost = Math.min((rickshawPrice+capPice),ticketPrice[3]);
            System.out.println(totalMinCost);
        }
    }

    private static int getMinCapCost(int[] ticketPrice, int[] capUsage) {
        int capNormalCost = 0;
        for (int ele : capUsage) {
            capNormalCost += Math.min(
                    (ele * ticketPrice[0]), ticketPrice[1]
            );
        }
        return Math.min(capNormalCost,ticketPrice[2]);
    }

    private static int getMinRickshawCost(int[] ticketPrice, int[] rickshawUsage) {
        int rickshawNormalCost = 0 ;

        for (int ele:rickshawUsage){
            rickshawNormalCost += Math.min(
                    (ele*ticketPrice[0]),ticketPrice[1]
            );
        }
        return Math.min(rickshawNormalCost,ticketPrice[2]);
    }
}