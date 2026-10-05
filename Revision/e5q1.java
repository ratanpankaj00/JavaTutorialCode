package Revision;
import java.util.Scanner;
public class e5q1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte num = scan.nextByte();
        for (int i = num; i > 0; i--) {
            for(int j = 1; j<=i; j++ ){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
