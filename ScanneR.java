import java.util.Scanner;

public class ScanneR {

    public static void main(String[] args) {
        // ----------Scanner class: Takes input from user from keyboard.-----------
         Scanner s = new Scanner(System.in);           //class
         float a = s.nextFloat();                     // we called a particular method of this class.
         System.out.println(++a); 

         // ------"hasNextInt()" method will check if the user input is integer or not-------
        
         boolean A = s.hasNextInt();
         System.out.println(A);


        /* ------"sc.next()" and "sc.nextLine()" will print the first word and the who
        le sentence respectively. */
        String str = s.next();
        String Strin = s.nextLine();
        System.out.println(Strin + " " +str);

    }
}
