package practice.recursion;

/*


    program to find out power of a number
    Program to find factorial of a number using recursion (AMCAT -17 times , Cocubes -1)
    Program to find GCD of two numbers using recursion (AMCAT -197 times , Cocubes -148)
    Program to find LCM of two numbers using recursion(AMCAT -240 times , Cocubes -98)
    Program to print Fibonacci series of given range using recursion(AMCAT -98 times , Cocubes -54)
    Program to find out sum of digits of a number using recursion(AMCAT -15 times , Cocubes -117)
    Program to reverse any number using recursion(AMCAT – 4 times , Cocubes -15)
    Program to check if given number is palindrome using recursion(AMCAT -11 times , Cocubes -4)
        Program to find power of a number using recursion(AMCAT -12 times)
        Program to print numbers from 1 to 100 without using loops



*/
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Value of 5! is: "+fact(5));
        System.out.println("Power of 4 to 2 is "+power(2,3));
        System.out.println("Summation of all numbers till 10 is "+sum(10));
        System.out.println("For difference between --n and n-- called function fun: ");
        fun(5);
    }
    public static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }

    public static int power(int b,int p) {
        if(p<=0) return 1;
        return b*power(b,p-1);
    }
    public static int sum(int n){
        if(n<=0) return 0;
        return n+sum(n-1);
    }
    public static void fun(int n){
        if(n==0)return ;
        //  RETURN  fun(n--);              // error as --n aand n-- are ot same -> n-- passes the value(5) to the fun then decrements to 4,
        System.out.print("");               // , thus will go in infinite fun calls
        fun(--n);
    }
}




