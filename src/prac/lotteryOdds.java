package prac;

import java.util.Scanner;

public class lotteryOdds {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers do u need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number u can draw?");
        int z = in.nextInt();

        int lotteryOdds=1;
        for ( int i=1 ; i <= k; i++)
        {
            lotteryOdds =lotteryOdds * (z - i + 1) / i;

        }
        System.out.println("ypur odds are 1 in "+ lotteryOdds +".GoodLuck");
    }
}
