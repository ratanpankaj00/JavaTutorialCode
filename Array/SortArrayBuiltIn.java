import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // Sort - ascending order
        int[] arr = { 4, 8, 0, 12, -1 };
        print(arr);
        Arrays.sort(arr);
        print(arr);





    }

    public static void print(int[] x) {
        System.out.println();
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}
