package MultiDimentionalArray;

public class TransposeRecMatrix {
    public static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int element : a) {
                System.out.print(element + " ");
            }
            System.out.println();
        }System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {
                { 6, 8, 2, 7, 0 },
                { 1, 3, 0, 7, 2 },
                { 0, 9, 9, 4, 5 },
                { 5, 3, 7, 8, 1 }
        };
        print(arr);
        int parentRows = arr.length;
        int parentColumns = arr[0].length;

        int [][] newArr = new int[parentColumns][parentRows];
        for(int i = 0; i<parentRows; i++){
            for(int j = 0; j<parentColumns; j++){
                newArr [j][i] = arr[i][j];
            }
        }print(newArr);
    }
}
