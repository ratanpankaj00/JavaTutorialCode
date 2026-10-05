package Revision.recursionProblems;

class Methods {
    public static void printNumbersTillN(int x) {
        if (x == 0) {
            return;
        }
        printNumbersTillN(x - 1);
        System.out.print(x + " ");
    }

    public static int nFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * nFactorial(n - 1);
    }

    public static int sumOfNNaturalNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNNaturalNumbers(n - 1);
    }

    public static int sumOfDigitOfN(int n) {
        if (n / 10 == 0) {
            return n;
        }
        int x = n % 10;
        n = (int) n / 10;
        return x + sumOfDigitOfN(n);
    }

    public static int nTermOfFibbonacciSeries(int n) {

        if (n <= 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        return nTermOfFibbonacciSeries(n - 1) + nTermOfFibbonacciSeries(n - 2);
    }

    public static void starPattern(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        starPattern(n-1);
        System.out.println();
    }
}

public class recursionProblems {
    public static void main(String[] args) {
        Methods.printNumbersTillN(5);
        System.out.println("\n" + Methods.nFactorial(5));
        System.out.println(Methods.sumOfNNaturalNumbers(5));
        System.out.println(Methods.sumOfDigitOfN(2566));
        System.out.println(Methods.nTermOfFibbonacciSeries(6));
        Methods.starPattern(6);
    }
}
