package MultiDimentionalArray;

public class RotateArrayCW90 {
    public static void swapRows(int [][] arr){
        int low =0, high =arr.length - 1;
        while(low<high){
            int[] temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;high--;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                { 6, 8, 2, 7 },
                { 1, 3, 7, 2 },
                { 9, 9, 4, 5 },
                { 5, 3, 7, 8 }
        };
        //Swap the rows.
        swapRows(arr);
        
        //Now Transpose the matrix.
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }



    }
}
