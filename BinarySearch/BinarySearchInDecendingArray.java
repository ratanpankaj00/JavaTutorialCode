package BinarySearch;

public class BinarySearchInDecendingArray {

    public static Boolean BinarySearchrev(int[] arr, int tar) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSort = true;
            for(int k =0; k<arr.length-1; k++){
                if(arr[k]<arr[k+1]){
                    isSort = false;
                }
            }
            
            for(int j = 0; !isSort && j<arr.length - i-1; j++){
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] < tar) {
                    high = mid - 1;
                } else if (arr[mid] > tar)
                    low = mid + 1;
                else
                    return true;
            }return false;
            }

    public static void main(String[] args) {
        int [] arr = {2,4,1,0,-2,4,6,9,7,-3};
       System.out.println(BinarySearchrev(arr, 0)); 
    }
}
