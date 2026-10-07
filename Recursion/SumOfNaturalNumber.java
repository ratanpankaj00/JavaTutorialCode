package Recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(sumUptoN(10));
    }
    public static int sumUptoN(int n){
        if(n==0) return 0;
        return sumUptoN(n-1) + n;
    }
}
