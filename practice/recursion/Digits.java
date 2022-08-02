package practice.recursion;


// Write a program to find the addition of all the digits in a given number
// Write a program to find the product of all the digits in a given number
// Write a program to find if given number is palindrome or not.


import java.util.Scanner;

public class Digits{
    static int sum=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();

        System.out.println("Addition of all the digits in the given number is: "+sum(n));
        System.out.println("Product of all the digits in the given number is: "+product(n));
        reverse(n);
        System.out.println("Reverse of a given number is: "+sum);
        System.out.println(reverse2(n));
        System.out.println("A given number is palindrome : "+palindrome(n));
        System.out.println("Count of zero in number is: "+zeros(n,0));


    }
    private static int sum(int n){
        if(n<=0) return 0;
        int r=n%10;
        return r+sum(n/10);
    }
    private static int product(int n){
        if(n<=0) return 1;
        int r=n%10;
        return r*product(n/10);
    }
    private static void reverse(int n){
        if(n==0) return;
        int r=n%10;
        sum=sum*10+r;           //using scope as we need for all instances
        reverse(n/10);
    }

    private static int reverse2(int n){
      /*  main goal: Take a single number and To return int number(reverse number), but while calculating(calling)
         we need to have the number and sum also, we need A HELPER FUNCTION.
        ....// sometimes you eed some additional variables in the arguments in this case we take HELPER FUNCTION
      */

        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);

    }
    private static int helper(int n,int digits){
        if(n%10==n) return n;
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }

    static boolean palindrome(int n){
        return (n==reverse2(n));
    }

    //-------------------------no of zeros ----------------------------

    // first method takes count as an argument
    static int zeros(int n,int count){
        if(n/10<=0){
                return count;
        }
        if(n%10==0) count+=1;           // OR directly call  if(n%10==0) return zeros(n/10,count+1);
        return zeros(n/10,count);
    }

}
