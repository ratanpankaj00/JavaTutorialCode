package Revision;

import java.util.Scanner;

public class e3q1 {
    public static void main(String[] args) {
        System.out.print("Please Enter Something: ");
        Scanner scan = new Scanner(System.in);
        String input = new String();
        input = scan.nextLine();
        byte space2 = (byte) input.indexOf("  ");
        byte space3 = (byte) input.indexOf("   ");
        if (space2 == -1 && space3 == -1) {
            System.out.println("No Unecessary Space Detected.");
        } else if (space3 != -1) {
            System.out.println("More than two Space Detected");
        } else {
            System.out.println("Double Space Dected.");
        }
    }
}
