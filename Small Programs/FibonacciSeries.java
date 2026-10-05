import java.util.Scanner;
public class FibonacciSeries {
    public static int fibonacci(int n){
        int x =0;
        int y =1;
        if (n==1) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }else if(n>2){
            int sum = 0;
            for(int i = 2;i<n ; i++){
                y = (x+y);
                x = y-x;
            }
            return y;
        }else{

            System.out.println("Invalid input");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***FIBONACCI SERIES***");
        System.out.print("Enter which term you want: ");
        int a = scan.nextInt();
        System.out.println(fibonacci(a));

    }
}
