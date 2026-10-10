package Recursion;

// import java.util.ArrayList;
public class GenerateParantheses {
    public static void main(String[] args) {
        helper(5, 0, 0, "");
    }

    public static void helper(int n, int left, int right, String s) {
        if (left == n && right == n) {
            System.out.print(s + " ");
            return;
        }

        if (left < n) {
            helper(n, left + 1, right, s + "(");
        }

        if (right < left) {
            helper(n, left, right + 1, s + ")");
        }
    }

}
