package practice.basic;
/*

 program to print Fibonacci series of given range

*/

public class Fibonacii{
    static int a=1,b=1,c=0;
    public static void main(String[] args) {
        System.out.println("Fibonacii count till number n: ");
        System.out.print("1 1");
        fibonacci(9);
        System.out.println();



    }

    public static void fibonacci(int count) {

        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            fibonacci(count - 1);
        }
    }



}
