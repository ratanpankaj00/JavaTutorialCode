
import java.util.Scanner;

public class CBSEPercentageCalculator {
    public static void main(String[] args) {
        // System.out.println("hello world");
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Your Science Marks: ");
        float Science = Scan.nextFloat();
        System.out.print("Enter you Maths Marks: ");
        float Maths = Scan.nextFloat();
        System.out.print("Enter your Hindi Marks: ");
        float Hindi = Scan.nextFloat();
        System.out.print("Enter your Social Science Marks: ");
        float SST = Scan.nextFloat();
        System.out.print("Enter your English marks: ");
        float English = Scan.nextFloat();
        System.out.print("Congratulations you have got " + (Science + Maths + English + SST + Hindi)/5.0 +  "% in your boards");

    }
}