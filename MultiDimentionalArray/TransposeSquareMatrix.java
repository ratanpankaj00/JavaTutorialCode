package MultiDimentionalArray;

public class TransposeSquareMatrix {
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
                { 6, 8, 2, 7 },
                { 1, 3, 7, 2 },
                { 9, 9, 4, 5 },
                { 5, 3, 7, 8 } };
        print(arr);
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                    swap ++;
                }else continue;
            }
        }
        print(arr);
        System.out.println("Swaps required = " + swap);
    }
}
