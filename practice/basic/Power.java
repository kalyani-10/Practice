package practice.basic;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        int base, exponent;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        base=sc.nextInt();
        System.out.print("Enter the exponent: ");
        exponent=sc.nextInt();
        System.out.println(" Answer using for loop: ");
        System.out.println(powerfor(base,exponent));
        System.out.println();
        System.out.println(" Answer using while loop: ");
        System.out.println(powerwhile(base,exponent));

        // using RECURSION IN RECURSION FOLDER

    }
    static int powerfor(int base, int exponent)
    {
        int power = 1;
            //increment the value of i after each iteration until the condition becomes false
        for (int i = 1; i <= exponent; i++)
        //calculates power
            power = power * base;
        //returns power
        return power;
    }
/*
    In the above program, we can replace the for loop with the following for loop, the logic is quite different but gives the same result.

    int base = 3, exponent = 4;
    long result = 1;
for (; exponent!= 0; --exponent)
    {
        result = result * base;
    }
*/

    static long powerwhile(int base,int exponent){
        int expo=exponent;
        long power = 1;
            //executes until the condition becomes false
        while (exponent != 0)
        {
        //calculates power
            power = power * base;
            //decrements the power by 1
            --exponent;
        }
        return power;
    }


    // USING RECURSION IN RECURSION FOLDER

}
