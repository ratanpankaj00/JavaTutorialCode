package Strings;

import java.util.Collection;
import java.util.Collections;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length() + " " + s.capacity());
        s.append("Raghav");
        System.out.println(s);
        System.out.println(s.length() + " " + s.capacity());
        s.setCharAt(1, 'o');
        System.out.println(s);
        // s.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(s.length() + " " + s.capacity());

        // Reversing string builder.
        //Method - 1 : -
        s.reverse();
        System.out.println(s);

        // Method-2
        int i = 0 , j = s.length()-1;
        while(i<=j){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i, temp2);
            s.setCharAt(j, temp1);
            i++;j--;
        }
        System.out.println(s);

        //Deleting characters 
        s.delete(3,6);

        //Sorting possible or not
        Collections.sort(s);// Does not work.

    }
}
