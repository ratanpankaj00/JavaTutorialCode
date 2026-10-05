package SortingAlgorithm;

public class BubbleAlgoOptimised{

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
        for(int i=0; i<n-1; i++){
            boolean isSorted = true;
            for(int j=0; j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) break;

            for(int k=0; k<n-1 && isSorted == false ; k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        print(arr);
    }
}