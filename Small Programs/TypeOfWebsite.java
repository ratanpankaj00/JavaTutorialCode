import java.util.Scanner;

public class TypeOfWebsite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Web URL To Know It's Category");
        String url = scan.nextLine().toLowerCase();
        
        
        if((int)url.indexOf(".com") != -1){
            System.out.println("The given URL is of COMMERCIAL Website.");
       }
       else if((int)url.indexOf(".org") != -1){
            System.out.println("The given URL is of ORGANISATION Website.");
       }
       else if((int)url.indexOf(".gov.in") != -1){
            System.out.println("The given URL is of INDIAN GOVERNMENT Website.");
       }
       else if((int)url.indexOf(".ac.in") != -1){
            System.out.println("The given URL is of INDIAN EDUCATIONAL INSTITUTE Website.");
       }
       else if((int)url.indexOf(".in") != -1){
            System.out.println("The given URL is of a INDIAN Website.");
       }
       else{
        System.out.println("OOPS! We have not listed this type of URL.");
       }
        
    }
}
