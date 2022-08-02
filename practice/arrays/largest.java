package practice.arrays;
/*

Write a program to find out largest element of an array
Write a program to find largest and smallest number in an array
Write a program to find out second largest element of an unsorted array
Write a program to find out second smallest element of an unsorted array
*/

import java.util.*;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class largest {
    public static void main(String[] args) {
        //  int[] n;  or int n[];
        //  int[] a= new int[10];           // with fixed size

        int[] n = new int[]{ 1,5,-8,4,9,-12,9,14};

        normal(n);
        System.out.println();
        System.out.println("-------------");
        buildin(n);
        System.out.println("-----------");
        sorting(n);
        System.out.println();
        System.out.println("--------------");
        //-----------------------------------------------

        // COlLECTIONS
        Integer[] a = { 1,5,-8,4,9,-12,9,14};
        usingCollections(a);

    }
    private static void normal(int[] n){
        int max=MIN_VALUE,min=MAX_VALUE;

        for(int i=0;i<n.length;i++){
            if (n[i]>max) max=n[i];
            if(n[i]<min) min=n[i];
        }
        System.out.println("Greatest  number in array is: "+max);
        System.out.println("Smallest number is: "+min);
    }
    private static void buildin(int[] n){
        Arrays.sort(n);
        System.out.println("Greatest is: "+n[(n.length)-1]);
    }
    private static void sorting(int[] n){
        int temp;
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]>n[j]){
                    //swap
                    temp=n[i];
                    n[i]=n[j];
                    n[j]=temp;
                }
            }
        }
        System.out.println("largest is: "+n[n.length-1]);
        System.out.println("Second Largest is "+n[n.length-2]);
        System.out.println("Smallest is "+n[0]);
    }

    private static void usingCollections(Integer[] n){
        List<Integer> list2=Arrays.asList(n);
        Collections.sort(list2);
        System.out.println("Second smallest: "+list2.get(1));
        System.out.println("second largest: "+ list2.get(list2.size()-1));
    }
}
