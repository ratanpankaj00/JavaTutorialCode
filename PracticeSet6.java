import java.util.Scanner;
public class PracticeSet6 {

    public static void main(String[] args){
        // Question 1: Create an array of 5 floats and calculate.
        // float [] sgpa = new float[5];
        // sgpa[0] = 8.40f; 
        // sgpa[1] = 8.70f; 
        // sgpa[2] = 7.70f; 
        // sgpa[3] = 8.90f; 
        // sgpa[4] = 9.00f; 

        float[] cgpa = {5.4f, 4.0f, 8.9f, 9.9f, 7.1f};
        // float sum = 0;
        int i;
        int j;
        // for(i = 0; i<sgpa.length; i++){
        //     sum = (sum + sgpa[i]);
        // }
        // System.out.println("The sum is " + sum);

        //Question 2: Write a program to find wheather a given integer is preset in an array or not?
        // Scanner scan = new Scanner(System.in);
        // float input = scan.nextFloat();
        //     for(i=0;i<cgpa.length; i++){
        //     float search = cgpa[i];
            
        //     if (search == input){
        //         String present = "Present";
        //         System.out.println(present);
        //     }
        // }
        // if (input == input){
        //     System.out.println("Absent");
        // }       

        // Question no. 3
        //  int[] marks = new int[5];
        //  marks[0] = 82;
        //  marks[1] = 76;
        //  marks[2] = 98;
        //  marks[3] = 65;
        //  marks[4] = 32;

        //  for(int element:marks){
        //     sum = 0;
        //     sum = sum + element;
        // }
        // System.out.println((int)(sum/marks.length));

        //Question 4:
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[2][3];
        mat1[0][0] = 11;
        mat1[0][1] = 27;
        mat1[0][2] = 13;
        mat1[1][0] = 13;
        mat1[1][1] = 21;
        mat1[1][2] = 51;
        mat2[0][0] = 23;
        mat2[0][1] = 44;
        mat2[0][2] = 11;
        mat2[1][0] = 33;
        mat2[1][1] = 73;
        mat2[1][2] = 28;

        System.out.println("Matrix 1 is: ");
        for(i=0; i<mat1.length;i++){
            for(j=0; j<mat1[i].length; j++){
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 is: ");
        for(i=0; i<mat2.length;i++){
            for(j=0; j<mat2[i].length; j++){
                System.out.print(mat2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("The Sum Of MATRIX 1 AND MATRIX 2");

        for (i=0; i<mat1.length; i++){
            for(j=0; j < mat1[i].length; j++){
                System.out.print(mat1[i][j] + mat2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


            //Question 5:
        // for(i=0; i<mat1.length; i++){
        //     int max = 0;
        //     for(j=0; j<mat1.length; j++){

        //         if (mat1[i][j]>=mat1[i+1][j]) {
        //             max = max + mat1[i][j];
        //     }
                
        //     }
        // }


    }
}