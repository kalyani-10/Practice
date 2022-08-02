package practice.basic;

// is given number prime or not
// given n find all prime numbers till n    using sieve of eratosthenes

public class Prime {
    public static void main(String[] args) {
        int n=17;
        System.out.println(isPrime(17));
        System.out.println("Prime numbers till n are: ");
        // using normal method: not efficient, eg for n=100 it checks for all numbers ,
        // we don't need to check for 4,6,8,10.. 9,12,16,15,18, THUS USE SIEVE OF ERATOSTHENES
        for(int i=1;i<=n;i+=1){
                if(isPrime(i)) System.out.print(" "+i);
        }


        //----------------------SIEVE -----------------
        boolean[] primes= new boolean[n+1];            // space complexity n+1
        System.out.println();                              // time complexity is n*log(log n)
        sieve(n,primes);


    }
    private static boolean isPrime(int n){
        int c=2;
        if(n<=1)return false;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

// value of primes is false means number is prime
    static void sieve(int n,boolean[] primes){
        int j=1;
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for (j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
