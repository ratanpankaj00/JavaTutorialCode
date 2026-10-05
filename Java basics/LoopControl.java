
import java.util.Scanner;

public class LoopControl {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.print("Specify the value of 'n': ");
        int n= scan.nextInt();
        int i = 1;
         while (i<=(2*n-1)) {
            System.out.println(i);
            i = i+2;
         }
         
         do{
             System.out.println(i);
             i++;
            }while (i!=101) ; //DO While loop is guaranteed to execute atleast one time.
           
           
            for(int i=1; i<=10; i++) {
            System.out.println(i);
           }
        
    }
}
