import java.util.Scanner;

public class PractiseSet2 {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        /*  Question 1
        System.out.print("Please enter your Grade: ");
        String grade = (s.next());
        grade = (char)(grade);
        char gradeEnc = (char)(grade + 8);
        System.out.println("Your Encrypted grade is " + (gradeEnc));
        */

       /* Question 2
        System.out.println("Enter Your Guessed Number");
        BigInteger num = s.nextBigInteger();
        int lottery = 0;
        System.out.println(num==lottery);

        System.out.println("Your Last Attempt");
        BigInteger num1 = s.nextBigInteger();
        System.out.println(num1==lottery);
        */

        System.out.println("***Lets Calculate Distance travelled by a point object with constant acceleration***");
        System.out.print("Final speed(m/s): ");
        float v = s.nextFloat();
        System.out.print("initial speed(m/s): ");
        float u = s.nextFloat();
        float a = 9.80f;
        System.out.println("So distance travelled is: " + ((v*v - u*u)/(2.0f*a)) + "m");


    }
}
