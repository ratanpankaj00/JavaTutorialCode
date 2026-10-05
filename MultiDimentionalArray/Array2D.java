package MultiDimentionalArray;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        //Creating and initialising.
        int [][] arr = {{6,8,2,7,6}, {1,3,7,2,2},{9,9,4,5,2}};
        
        //How to print: - Using two nested loops.
        for(int i = 0; i<arr.length; i++){
            for(int element: arr[i]){
                System.out.print(element + " ");
            }System.out.println();
        }

        // Print column Wise:
        for(int i = 0; i<arr[0].length; i++){
            for(int j = 0; j< arr.length; j++ ){
                System.out.print(arr[j][i] + " ");
            }System.out.println();
        }

        //How to take input from user in 2D array.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
        int [][] userArr = new int[rows][columns];
        for(int i = 0; i<rows; i++){
            System.out.println("Enter "+(i+1) +"th row elements(" + columns+ " elements)");
            for(int j = 0; j<columns ; j++){
                userArr[i][j] = scan.nextInt();
            }
        }
    }
}
