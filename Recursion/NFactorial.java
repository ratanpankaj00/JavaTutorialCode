package Recursion;

public class NFactorial {
    public static void main(String[] args) {
        // factorial(6);
        System.out.println(factorial(6));
    }
    public static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);

    }
}
