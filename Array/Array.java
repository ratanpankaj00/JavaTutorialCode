package GFG;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int karan[] = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < karan.length; i++) {
            if(i==7){
                break;
            }
            karan[i] = sc.nextInt();
        }
        // Print negative values only
        // for(int i=0; i<n; i++){
        //     if(karan[i]<0){
        //         System.out.print(karan[i] + " ");

        //     }else{
        //         continue;
        //     }
        // }

        //Print the sum
        int sum = 0;
        for (int i =0; i<n; i++) {
            sum += karan[i];
        }
        System.out.println(sum);
    }
}