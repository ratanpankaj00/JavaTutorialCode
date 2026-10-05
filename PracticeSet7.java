import java.util.Scanner;
public class PracticeSet7 {
    static int SumOfNaturalNumbers_iterative(int n){
        int a = 0;
        for(int i = 1; i<=n; i++){
            a = a+i;
        }
        return a;
    }

    static int SumOfNaturalNumbers_recursive(int n){
        int a=0;
        if(n>0){
            return a = n + SumOfNaturalNumbers_recursive(n-1);
        }else{
            return 0;
        }
    }
    static float avarage(float... arr){
        float avg = 0;
        for(float element : arr){
            avg = avg + element;
        }
        return (avg/5f);
    }
    
    static String pattern(int n){
        if(n>0){
           return "*\n " + pattern(n-1);
        }else{
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Question no. 4 & 8
        // System.out.print("Enter the value of n: ");
        // int n = scan.nextInt();
        // System.out.println(SumOfNaturalNumbers_recursive(n));

        //Question no. 6
        System.out.println(avarage(24, 67,78,43,76));
        int n = scan.nextInt();
        System.out.println(pattern(n));



    }
}
