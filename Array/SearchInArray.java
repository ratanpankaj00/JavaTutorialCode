import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        int[] arr = { 56, 87, 92, 45, 0, -12, -6 };
        searchArray(arr);

    }

    public static void searchArray(int[] x) {
        Boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search.");
        int s = sc.nextInt();
        for (int i = 0; i < x.length; i++) {
            if (x[i] == s) {
                System.out.println(s + " is present at index " + i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Element not found.");
        }
    }
}
