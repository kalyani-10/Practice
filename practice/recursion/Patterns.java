package practice.recursion;

/*
// func1
* * * *
* * *
* *
*
*/

public class Patterns {
    public static void main(String[] args) {
        int n=4;
        System.out.println();
        func1(n,0);

    }
    private static void func1(int r, int c){
        if(r==0) return;
        if (c<r) {
            //func1(r-1,0);                 //for upright triangle    // *
            System.out.print("* ");                                   // * *
            func1(r,c+1);                                          // * * *
        }
        else {
            //func1(r-1,0);                 // for upright triangle
            System.out.println();
            func1(r-1,0);
        }

    }


}
