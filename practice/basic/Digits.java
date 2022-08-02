package practice.basic;

import java.util.Scanner;

/*
Write a progra to:
Spilt the number into its digits
Count number of Digits
sum of Digits
program to check given number is Armstrong number or not  (153= 1cube + 5cube +3cuve = 153

*/

public class Digits {
    public static void main(String[] args) {
        /*Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();*/

        int n=8334;
        number_to_digits(n);
        System.out.println();
        sum(n);

        armstrong(153);
    }
    private static void number_to_digits(int n){
        System.out.println("Digits in number are: ");
        int r=0;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.print(r+" ");
        }
    }
    private static void sum(int n){
        //same as above func

        System.out.println("Sum of Digits are: ");
        int r=0,sum=0,count=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum+=r;
            count+=1;
        }
        System.out.print(sum);
        System.out.println();
        System.out.println("Count of Digits are: ");
        System.out.print(count);
    }

    private static void armstrong(int n){
        int r=0,count =0;
        int original=n;
        while(n>0){
            r=n%10;
            n/=10;
            count += (r*r*r);
        }
        if(count==original){
            System.out.println(" Number is Armstrong");
        }else
            System.out.println("Number is Not Armstrong");

    }
}

