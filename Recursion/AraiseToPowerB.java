package Recursion;

public class AraiseToPowerB {
    public static void main(String[] args) {
        System.out.println(power1(3, 4));
    }
    public static int power(int a, int b){
        if(b==0) return 1;
        return a*power(a, b-1);
    }

    public static int power1(int a, int b){
        if(b==1) return a;
        int x = power1(a, b/2);
        if(b%2 ==0){
            return x* x;
        }
        else{
            return x * x * a;
        }
    }
}
