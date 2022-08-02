package practice.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {

        traditional(36);
        System.out.println();
        sqrtMethod(36);
        System.out.println();
        sqrtMethod2(36);

    }

    //time complexity - O(n)
    public static void traditional(int n) {            //not efficient as it repeats the i vales as 5*4 and 4*5
        for (int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }

    }
    //
    public static void sqrtMethod(int n) {
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i)                      // without this if the values of 6*6 will repeat 6
                    System.out.print(i+" ");
                else System.out.print(i+" "+n/i+" ");
            }
        }

    }

    // as above func wont print the factors in sorted order we store it in list and sort them
    public static void sqrtMethod2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i)                      // without this if the values of 6*6 will repeat 6
                    list.add(i);
                else {
                    list.add(i);
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
