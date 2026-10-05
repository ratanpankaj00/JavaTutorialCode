package Revision;

public class e6q6 {
    public static void main(String[] args) {
        float[] arr = { 34.32f, 56.41f, 98.94f, 25.40f, 0.43f };

        // Displaying the elements of array in reverse order.
        for (int i = arr.length; i > 0; i--) {
            System.out.println((i - 1) + ": " + arr[i - 1]);
        }
        System.out.println("\n");

        // Displaying the elements of array in order.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Finding Sum Of the elements.
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of elements of array is: " + sum);

        // Finding maximum value in the arraylist.
        float z = 0, y=0;
        for (int i = 0; i < arr.length; i++) {
            if (z > arr[i]) {
                y = arr[i];
            } else {
                z = arr[i];
            }
        }
        System.out.println("The MAX NUMBER is " + z);
        System.out.println("The MIN NUMBER is " + y);

    }
}
