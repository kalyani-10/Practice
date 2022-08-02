package practice.basic;

public class SquareRoot {
    public static void main(String[] args) {
        int n=36;
        int p=2;
        System.out.println(sqrt(n,p));
        System.out.println();
        System.out.println(NewtoRaphson(40));
    }

    //time complexity: o(log n)
    static double sqrt(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;

//        first integer no of root
        while(start<=end){
            //find middle element
            //int mid=(start+end)/2;       int has small range thus start+end will give out of range answer, consider int has limit of 10; thus 8+9/2 will be >10

            int mid=start+ (end-start)/2;   // its same as start+end/2    , it never exeds the range eg,mid =8+(9-8)/2

            if(mid*n==n) return mid;
            if(mid*mid< n)
                end=mid-1;
            else if(mid*mid>n)
                start=mid+1;

        }
        double inc=0.1;
        for (int i=0;i<p;i++){
            while(root*root<=n){
                root+=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }



//    r=(x+n/x )/2 , x- assumed root , r- real root, n- number
//    here error = r-x

    public static double NewtoRaphson(double n)       // time complexity is O(log n(f(n))),  f(n) = cost of calculating f(x)/f(x)^
    {
        double x=n;
        double root;
        while(true){
            root  =0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5) break;
            x=root;
        }
        return root;
    }
}
