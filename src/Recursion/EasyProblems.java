package Recursion;

public class EasyProblems {

    public static void main(String[] args) {
        
        funCountZeros2(10020030); 
        System.out.println(count);
    }

    public static void fun(int n){

        if(n == 0)
        return;

        System.out.println(n);
        fun(n-1);
    }

    public static void funRev(int n){

        if(n == 0)
        return;

        funRev(n-1);

        System.out.println(n);
    }

    public static int funProduct(int n){

        if(n <= 1)
        return 1;

        return n * funProduct(n-1);
    }

    public static int funSum(int n){

        if(n <= 1)
        return 1;

        return n + funSum(n-1);
    }

    public static int funSumDigit(int n){

        if(n == 0)
        return 0;

        return (n%10) + funSumDigit(n/10);
    }

    public static int funSumProduct(int n){

        if(n == 0)
        return 1;

        return (n%10) * funSumProduct(n/10);
    }

    public static boolean Palindrone(int n){

        return n == funNumberReverse2(n);

    }

    static int sum=0;

    public static void funNumberReverse(int n){

        if(n == 0)
        return;

        sum = ( sum * 10 ) + (n%10);

        funNumberReverse(n/10);
    }

    public static int funNumberReverse2(int n){

        int digits=(int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    public static int helper(int n, int digits){

        if(n%10 == n)
        return n;

        return (n%10) * (int)Math.pow(10,digits-1) + helper(n/10, digits - 1);
    
    }

    public static int funCountZeros(int n){

        return ZeroCounter(n,0);

    }

    public static int ZeroCounter(int n, int count){

        if(n == 0)
        return count;

        if(n%10 == 0)
        return ZeroCounter(n/10, count+1);
        else
        return ZeroCounter(n/10, count);

    }

    static int count=0;

    public static void funCountZeros2(int n){

        if(n==0)
        return;

        if(n%10 == 0)
        count=count+1;
        
        funCountZeros2(n/10);

    }

}

