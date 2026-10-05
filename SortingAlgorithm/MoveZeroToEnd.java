package SortingAlgorithm;

public class MoveZeroToEnd {

    public static void print(int [] arr){
        for(int element : arr){
            System.out.print(element +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 0, -2, 3, 0, 4, 8, 0, 10, 12 };
        print(arr);
        int j =0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr [i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }print(arr);



    }
}
