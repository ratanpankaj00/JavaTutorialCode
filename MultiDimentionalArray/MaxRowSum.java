package MultiDimentionalArray;

public class MaxRowSum {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 1, 6, 8 },
                { 9, 0, 0, 4 },
                { 2, 3, 6, 1 }
        };

        int sum = 0;
        int maxSum = 0;
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            if ((sum) > maxSum) {
                maxSum = sum;
                index = i;
            }
            sum = 0;
        }System.out.println(index);
    }
}