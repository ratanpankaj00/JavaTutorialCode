package MultiDimentionalArray;

public class SpirallyTransversingMatrix {
    public static void rotateMatrix(int [][] arr){
        int low =0, high =arr.length - 1;
        while(low<high){
            int[] temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;high--;
        }

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
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 1, 0, 4, 67, -2 }
        };
        

        

        

    }
}