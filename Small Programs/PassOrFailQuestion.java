import java.util.Scanner;
public class PassOrFailQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //QUESTION NO.1 : 
        System.out.println("***FIND IF YOU ARE PASS OR NOT IN PCM EXAMS***");
        System.out.print("Enter your marks in Physics(out of 100): ");
        float phy = scan.nextFloat();
        System.out.print("Enter your marks in Chemistry(out of 100): ");
        float chem = scan.nextFloat();
        System.out.print("Enter your marks in Maths(out of 100): ");
        float maths = scan.nextFloat();

        if (phy>=33 && chem >= 33 && maths >= 33 && phy+maths+chem >=120.0){
            System.out.println("Congratulations You have cleared the cutoff.");
            System.out.println("Your total score is "+ (phy + chem + maths) + "(Total " +(phy + chem + maths)/3 + "%).");
        }
        if (phy<33){
            System.out.println("You are fail in Physics by " + (int)(33-phy) + " marks(\"NOT QUALIFIED\")." );
        }
        if (chem < 33){
            System.out.println("You are fail in Chemistry by " + (int)(33-chem) + " marks(\"NOT QUALIFIED\").");
        }
        if (maths < 33){
            System.out.println("You are fail in Maths by " + (int)(33-maths) + " marks(\"NOT QUALIFIED\").");
        }
        if ( phy+maths+chem <120.0 || maths < 33 || chem < 33 || phy<33){
            System.out.println("OOPS! You have not cleared the overall Cuttoff(\"NOT QUALIFIED\").");
        }
        

        
        



    }
}
