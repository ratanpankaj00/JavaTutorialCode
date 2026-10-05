package SortingAlgorithm;

public class BubbleAlgo {
    public static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 6,2,1,3,4,5 };
        int n = arr.length;
        print(arr);
        int pass = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int k = 0; k<n-i-1; k++){
            if(arr[k+1]<arr[k]){
                for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            pass++;
            }
        }
            
        }
        System.out.println(pass);
        print(arr);

    }
}
