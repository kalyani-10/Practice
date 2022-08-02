package practice.recursion;

// leethcode problem 1342

public class Steps_to_make_Zero {
    public static void main(String[] args) {
        System.out.println("Calculate the number of steps required to make a number zero: "+ numberOfSteps(14));
    }
    public static int numberOfSteps(int num){
            return helper(num,0);
    }
    private static int helper(int num,int steps){
        if(num==0) return steps;
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        else return helper(num-1,steps+1);
    }
}
