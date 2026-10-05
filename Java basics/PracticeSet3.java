import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        
        //QUESTION NO.1: Detect more than one spaces consecutively.
        System.out.println("If there is double or triple space then \"True\", otherwise \"False\"");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //System.out.println(str == str.trim());
        int a = str.indexOf("  ");
        //int b = str.indexOf("   ");   //no necessary
        System.out.println(a>0);

        // QUESTION NO.2: Use Of Space Sequece Charcter.
        System.out.println("\"Dear Harry, This java coarse is nice. Thanks\" ");
    }
}
