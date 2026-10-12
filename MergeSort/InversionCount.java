package MergeSort;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = { -5, 0, -2, 1, -1, 3, 12, 7, 4, 9, 10, 0 };
        System.out.println(mergeSort(arr));
    }

    public static int mergeSort(int[] arr) {
        // Base Condition:
        int n = arr.length;
        if (n == 1)
            return 0;

        // Create Two array of almost equal size:
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Fill the elements in the newly created array in order.
        int idx = 0;
        for (int i = 0; i < a.length; i++)
            a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++)
            b[i] = arr[idx++];

        // Magic of recursion


        // Sorting the arrays
        int count = mergeSort(a);
        count += mergeSort(b);
        count += compare(a, b);
        merge(a, b, arr);
        return count;
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j])
                arr[k++] = a[i++];
            else if (a[i] > b[j])
                arr[k++] = b[j++];
        }
        while (j < b.length)
            arr[k++] = b[j++];
        while (i < a.length)
            arr[k++] = a[i++];
    }

    private static int compare(int[] a, int[] b) {
        int count = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                count += (a.length - i);
                j++;
            } else if (a[i] <= b[j]) {
                i++;
            }
        }
        
        return count;
    }
}
