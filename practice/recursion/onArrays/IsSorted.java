package practice.recursion.onArrays;

// Find if Array is Sorted or not

public class IsSorted {
    public static void main(String[] args) {
        System.out.println("Is the Given Array Sorted:  "+isSorted((new int[]{12, 4, 5, 6}),0));
    }
    private static boolean isSorted(int[] arr,int n){
        if(n==arr.length-1) return true;
       return arr[n]<arr[n+1] && isSorted(arr,n+1);         // t && t = t , thus use &&
    }
}
