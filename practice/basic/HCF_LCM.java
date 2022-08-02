package practice.basic;
// qst : you have 3l of jar and 5l of jar , you want 4l from those jar

public class HCF_LCM {
    // hcf of a,b is min value of the equation ax+by =hcf , x,y are any random values we want
    // lcm is min number divisible by both a,b
    public static void main(String[] args) {
        System.out.println(gcd(2,7));

        System.out.println(lcm(2,7));


    }
    static int gcd(int a, int b){
       if(a==0) return b;
       return gcd(b%a,a);
    }
//    lcm*gdc=a*b
    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
