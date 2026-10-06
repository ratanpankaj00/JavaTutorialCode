package Recursion;

public class PrintOneToN {
    static int n = 10;
    public static void main(String[] args) {
        print(1, 10);
        System.out.println();
        pritn(10);
        System.out.println();
        print(1);
    }
    
    // Method - 1 (BETTER)
    public static void pritn(int n){
        if(n==0) return;
        pritn(n-1);
        System.out.println(n + " ");
    }

    //Method -2 
    public static void print(int x, int n){
        if(x>n) return;
        System.out.print(x + " ");
        print(x+1, n);
    }

    //Method - 3(LESS USED)
    public static void print(int x){
        if(x > n) return;
        System.out.println(x + " ");
        print(x+1);
    }

}
