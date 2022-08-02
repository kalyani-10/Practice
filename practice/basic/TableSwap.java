package practice.basic;
/*

Write a program to generate multiplication table
Write a program to swap two integers
Write a program to swap two numbers without using third variable

*/

public class TableSwap {
    public static void main(String[] args) {
        int n=4;
        table(n);
        System.out.println();
        swap(4,7);
    }
    private static void table(int n){
        System.out.println("Table of the number is: ");
        int s=0;
        for(int i=0;i<10;i++){
            System.out.print((s+=n) +" ");
        }

        System.out.println();
        // OR

        for(int i=1;i<=10;i++){
            System.out.print((i*n) +" ");
        }
    }
    private static void swap(int a, int b){
        System.out.println("After Swapping: ");
        int t= a;
        a=b;
        b=t;
        System.out.print(a+" "+b);

        // SWAPPING WITHOUT TEMP VARIABLE
        System.out.println();

        System.out.println("Swapping without use of extra var: ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+" "+b);


    }
}
