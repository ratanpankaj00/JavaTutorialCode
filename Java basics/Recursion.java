import java.util.Scanner;
public class Recursion {
    static Long factorial(long n){
        if (n == 0 || n==1) {
            return 1l;
        }
        else {
           return n * factorial(n-1);
        }
    }

    public static long factorial_itterative(long n){
        if(n==1 || n==0){
            return 1;
        }
        else {
            long product = 1;
            for (long i = n; i>0; i--){
                product = i* product;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        long a = scan.nextLong();
        System.out.print(factorial_itterative(a));

        /*
        To find factorial we have two approaches:
        1. Recurrive approach(The above method).
        2. Itterative approach(by using loop).
        */

    }
}


