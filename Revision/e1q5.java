package Revision;
import java.util.Scanner;
public class e1q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks of SUBJECT-1 : ");
        Float s1 = scan.nextFloat();
        System.out.println("Enter your marks of SUBJECT-2 : ");
        Float s2 = scan.nextFloat();
        System.out.println("Enter your marks of SUBJECT-3 : ");
        Float s3 = scan.nextFloat();
        System.out.println("Enter your marks of SUBJECT-4 : ");
        Float s4 = scan.nextFloat();
        System.out.println("Enter your marks of SUBJECT-5 : ");
        Float s5 = scan.nextFloat();
        System.out.println("You have got " +(s1+s2+s3+s4+s5)/5+"% marks.");

    }
}
