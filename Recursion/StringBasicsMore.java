package Recursion;
import java.util.ArrayList;
public class StringBasicsMore {
    public static void main(String[] args) {
        String s = "Kartikey";
        change(s); // A copy of s goes to the function and the s remains as it is.
        System.out.println(s);

        ArrayList<String> al = new ArrayList<>();
        al.add("Amir");
        al.add("Shamir");
        al.add("Raghav");
        al.add("Ravi");
        al.add("Aditya");
        change2(al); // Reference of arraylist goes into the function.
        System.out.println(al);

    }
    private static void change(String s){
        s = "Abhimanyu";
    }

    private static void change2(ArrayList<String> al){
        al.add("Piyush");
    }
}
