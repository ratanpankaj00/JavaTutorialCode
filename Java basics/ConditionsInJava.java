import java.util.Scanner;

public class ConditionsInJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age(15/18/22)");
        int age = scan.nextInt();
        
 /*       // IF ELSE STATEMENTS IN JAVA.
        System.out.print("Enter Your age: ");
        
        if(age>18){
            System.out.println("You can drive car.");
        }

        else if(age <= 18 && age >= 15){
            System.out.println("You can not drive car but can learn in a big field alone.");
        }
        else{
            System.out.println("You are not eligible to drive car.");
        }
*/
        // Switch Case Statement in Java.
        // Used to choose different alternatives from the given menu.

        switch (age) {
            case 15:
                System.out.println("You must be tenth pass.");
                break;
            case 18:
                System.out.println("You must be Twelth pass.");
                break;
            case 22:
                System.out.println("You must be at job.");
                break;
            default: 
                System.out.println("Please enter one of the given age."); 
                break; 
        }  
    }


}

