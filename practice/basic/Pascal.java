package practice.basic;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print(generate(4));
    }
    public static List<List<Integer>> generate(int n) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> row, pre = null;
            for (int i = 0; i < n; ++i) {
                row = new ArrayList<Integer>();
                for (int j = 0; j <= i; ++j){
                    if (j == 0 || j == i)
                        row.add(1);
                    else
                        row.add(pre.get(j - 1) + pre.get(j));}
                pre = row;
                res.add(row);
            }
            return res;
        }
}

/*                              OR
public class Main
{
    public static void main(String[] args) {
        int n=4;
        System.out.print("Start: ");
        System.out.println();
        for(int i =0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");      //for spacing
            }
            int C=1;
            for(int k=1;k<=i;k++){
                System.out.print(C + " ");
                C = C * (i - k) / k;
            }
            System.out.println();
        }
    }
}*/
