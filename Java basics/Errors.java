import java.util.Scanner;
import java.math.*;

public class Errors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter num1: ");
            int a = scan.nextInt();
            System.out.println("Enter num2: ");
            int b = scan.nextInt();
            System.out.println("modulo is : "+ (a%b));

        }catch(Exception any_name){
            System.out.println("Invalid number!!!");
        }

    }
}
