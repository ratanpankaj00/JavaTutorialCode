public class WaveArray{
    public static void main(String[] args) {
        /*Given an sorted array arr[] of integers.
        Sort the array into a wave-like array (In Place).
        In other words, arrange the elements into a 
        sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and
        so on. If there are multiple solutions, 
        find the lexicographically smallest one.*/

        int [] arr = {2,4,7,8,9,10};

        for(int i = 0; i<arr.length-1 ; i = i+2){
            swap(arr, i, i+1);
        }
        for(int ele : arr){
            System.out.print(ele);
        }

    }
    public static void swap(int [] arr ,int i, int j){
        int temp = arr[i];
        arr [i] = arr[j];
        arr [j] = temp;
    }
}