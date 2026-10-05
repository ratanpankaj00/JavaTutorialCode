package SortingAlgorithm;
import java.util.Scanner;
public class IfArrayIsSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter "+ n +" elements with simple space: ");
        for(int i = 0; i<n; i++){
            arr[i]= scan.nextInt();
        }

        boolean flag = false;
        for(int i = 0; i<n-1; i++){
            if(arr[i+1]<arr[i]){
                flag = true;
            }
        }
        if(flag) System.out.println("Array is not sorted.");
        else System.out.println("Array is sorted.");




    }
}
