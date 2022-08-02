package practice.basic;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("*****Reverse of number****");
        int n= 27342;
        System.out.println("Using WHILE loop: ");
        whileloop(n);
        System.out.println("Using FOR Loop: ");
        forloop(n);
        System.out.println("Using RECURSION: ");
        recursion(n);
    }

    public static void whileloop(int number) {
        int  reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
        System.out.println();
        System.out.println();
    }

    public static void forloop(int number) {
        int  reverse = 0;
        //we have not mentioned the initialization part of the for loop
        for( ;number != 0; number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
        System.out.println();
        System.out.println();
/*
        In the above program, we can also write the for loop as follows:

        for(;number != 0;)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        */
    }

    public static void recursion(int number) {
        if (number < 10)
        {
        //prints the same number if the number is less than 10
            System.out.println(number);
            return;
        }
        else
        {
            System.out.print(number % 10);
            recursion(number/10);
        }
    }
}
