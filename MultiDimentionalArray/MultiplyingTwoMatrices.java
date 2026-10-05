package MultiDimentionalArray;

public class MultiplyingTwoMatrices {
    public static void rotateMatrix(int[][] arr) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int[] temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }

        }

    }
    public static void print(int [][] arr){
        for(int [] row : arr){
            for(int element : row){
                System.out.print(element + " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 1, 5 },
                { 2, 5, 8 },
                { 1, 7, -2 }
        };
        int[][] arr2 = {
                { 2, 1, 8 },
                { 9, 0, 4 },
                { 2, 6, 1 }
        };
        int i = 0, j = 0;
        int n = arr1.length;
        int [][] resMat = new int[n][n];
        int temp1 =0;
        int temp2 =0;
        int temp3 =0;
        //We want arr1 * arr2 as resMat;
        rotateMatrix(arr2);
        for (i = 0; i <n; i++) {
            for (j = 0; j <n; j++) {
                temp1 += arr1[i][j]*arr2[i+0][j];
                temp2 += arr1[i][j]*arr2[i+1][j];
                temp3 += arr1[i][j]*arr2[i+2][j];
                
            }
            resMat[i][j-3] = temp1;
            resMat[i][j-2] = temp2;
            resMat[i][j-1] = temp3;
            temp1 =0;temp2 =0;temp3 =0;
        }print(resMat);

    }
}
