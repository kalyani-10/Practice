package practice.basic;

import java.util.Scanner;

/*

1. Give if any number is even or odd
2. Print all the even numbers till n

*/



public class Evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);          //input from user
        int n=sc.nextInt();
        bitwise(n);
        System.out.println("By normal Method:");
        traditional(n);
        // even nos till n
        even_till_n(n);
    }
    private static void traditional(int n){
        if(n%2==0) System.out.println("Even");
        else System.out.println("odd");
    }
    private static void bitwise(int n){
        // AND OPERATOR

        if((n&1) ==0) System.out.println("AND Even");       //n&1 != 1
        else System.out.println("AND odd");

        // OR OPERATOR

        System.out.println(n|1);                    //Result of OR operation
        if((n|1) >n ) System.out.println("OR Even");
        else System.out.println("OR Odd");


        //XOR OPERATOR

        if((n^1)>n ) System.out.println("XOR Even");             //(n^1)>n
        else System.out.println("XOR Odd");
    }
//                        2. Print all the even numbers till n

    private static void even_till_n(int n){
        System.out.println("All even numbers till n are: ");
        for(int i=0;i<n;i++){
            if ((i^1)>i) System.out.print(i+" ");
        }
    }

}
