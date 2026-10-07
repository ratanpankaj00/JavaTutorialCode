package Recursion;

public class Fibonacci {
    public static int NthFibonacciTerm(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        if(n==2) return 1;
        return NthFibonacciTerm(n-1) +NthFibonacciTerm(n-2);
    }
    public static void main(String[] args) {
        System.out.println(NthFibonacciTerm(5));
    }
}
