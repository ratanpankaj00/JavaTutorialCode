import java.util.Scanner;

public class IncomeTaxSlab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***INCOME TAX CALCULATOR***");
        System.out.print("\n Please give input of your net income(in Lacs): ");
        float inc = scan.nextFloat();
        float tax = 0;
        if(inc>2.5 && inc<=5.0){
            tax = ((inc - 2.5f) * 0.05f); 
            // System.out.println("Your net income tax of this year is: " + tax1 + "lacs");
        }
        else if(inc>5.0f && inc<=10.0f){
            tax = (2.5f * 0.05f)+((inc - 5.0f) * 0.20f); 
            // System.out.println("Your net income tax of this year is: " + tax2 + "lacs");
        }
        else if(inc>10){
            tax = (2.5f * 0.05f) + (5.0f * 0.20f)+((inc - 10.0f) * 0.30f); 
            // System.out.println("Your net income tax of this year is: " + tax3 + "lacs");
        }
        else{
            System.out.println("You are free from any income tax.");
        }
        System.out.println("Your net income tax of this year is: " + tax + "lacs");

    }
}
