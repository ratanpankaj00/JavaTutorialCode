public class Array {
    public static void main(String[] args) {
        // Method for declaration of array.
        // Method 1: Declaration + memory allocation + initailisation together
        
        int[] marks = {98,23,23,2,33,5};

        // Method 2: First declaration then memory allocation.
        int[] run;
        run = new int[5];
            
        //Method 3: Declaration and memory allocation together and then initialisation.
        int[] zerbra = new int[5];
        zerbra[0] = 45;
        zerbra[1] = 78;
        zerbra[2] = 98;
        zerbra[3] = 76;
        zerbra[4] = 81;

        // Array indices start from 0 and ends at (n-1).

        //display an array:
        // int i;
        // for(i=marks.length-1; i>=0; i=i-1){
        //     System.out.println(marks[i]);
        // }
        
        //multidimensional array:
        int [][] flats = new int [2][3];//Array of two rows and three columes. !!!important
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;
        
        //Displaying 2D Array.
        int i=0; int j=0;
        for(i=0; i<flats.length; i=1+i){
            for(j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            } 
            System.out.println();
        }
        
            
        
    }
}
