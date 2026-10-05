package SortingAlgorithm;

public class SelectionSort {
    public static void print(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 9, -3, 6, 5 };
        print(arr);
        // Search the smallest element in the array.
        for (int i = 0; i < arr.length; i++) {
            int minElement = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < minElement) {
                    minElement = arr[j];
                    index = j;
                }
            }

            // Now swapping in the array.
            int temp = arr[i];
            arr[i] = minElement;
            arr[index] = temp;
        }
        print(arr);

    }
}
