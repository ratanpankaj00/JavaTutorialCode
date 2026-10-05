package SortingAlgorithm;

public class BubbleAlgoMoreOptimised2 {
    public static void print(int [] arr){
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 7, 1, 3, 6, 0};
        int n = arr.length;
        print(arr);

        for(int i = 0; i<n-1; i++){
            boolean swap = false;
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        print(arr);
    }
}
