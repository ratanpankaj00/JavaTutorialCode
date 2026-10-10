package MergeSort;

public class Algoritm {
    public static void main(String[] args) {
        int [] arr  = {-5, 0, -2, 1, -1, 3, 12, 7, 4, 9, 10, 0};
        mergeSort(arr);
        for(int element : arr) System.out.print( element + " ");
    }
    public static void mergeSort(int [] arr){
        int n = arr.length;
        // Base Case: - 
        if(arr.length <= 1) return;
        
        // Step 1: - Create two equal sized array.
        int [] a = new int[n/2];
        int [] b = new int[n - n/2];

        // Step 2: - Fill the elements in order as it is into them.
        int idx = 0;
        for(int i = 0; i<a.length; i++) a[i] = arr[idx++];
        for(int i = 0; i<b.length; i++) b[i] = arr[idx++];

        //Step 3: - Magic of recursion- Raghav sir Special
        mergeSort(a);
        mergeSort(b);

        //Step 4: Merge a and b in sorted array.
        merge(a,b,arr);

    }
    private static void merge(int[] a, int[] b, int [] arr){
        int i = 0, j = 0, k = 0;
        for(k = 0; i<a.length && j<b.length; k++){
            if(a[i]<b[j]) arr[k] = a[i++];
            else arr[k] = b[j++];
        }

        while(i<a.length) arr[k++] = a[i++];
        while(j<b.length) arr[k++] = b[j++];
    }
}
