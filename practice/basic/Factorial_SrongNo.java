package practice.basic;
/*

Write a program to print factorial of given number
Write a program to check given number is strong number or not (145= 1fact + 4fact + 5fact)

*/

import java.util.Scanner;

public class Factorial_SrongNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Factorial of number is: "+fact(n));


        System.out.println();
        armstrong(n);

    }
    private static void armstrong(int n){
        int r=0,ans=0;
        int original=n;
        while(n>0){
            r=n%10;
            ans= ans+ fact(r);
            n/=10;
        }
        if(ans==original) System.out.println("And the number is STRONG !!");
        else System.out.println("but the number is NOT STRONG");
    }


    private static int fact(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }

}
