package Revision;

public class e6q4 {
    public static void main(String[] args){
        int [][] mat1 = {
            {9, 4, 2},
            {3, 8, 1},
            {5, 6, 7}
        };
        int [][] mat2 = {
            {12, 45, 56},
            {0, -23, 99},
            {31, 77, -12}
        };
        for(byte i = 0; i<mat1.length; i++){
            for(byte j = 0; j<mat1[i].length; j++){
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
