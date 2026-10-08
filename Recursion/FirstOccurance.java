package Recursion;

public class FirstOccurance {
    public static void main(String[] args) {
        int [] arr = {-10, -10, -3, -1, 0, 0, 2, 2, 2, 5, 8, 9, 11, 11, 23, 46, 46, 50, 90, 98, 98};
        System.out.println(firstOccurance(arr, -10, 0, arr.length));
    }

    private static int firstOccurance(int[] arr, int tar, int i, int j) {
        if (i>j) return -1;
        int mid = (i+j)/2;
        if(arr[mid] == tar){
            int left =  firstOccurance(arr, tar, i, mid-1);
            if(left != -1) return left;
            else return mid;
        }
        else if(arr[mid] < tar) return firstOccurance(arr, tar, mid+1, j);
        else {return firstOccurance(arr, tar, i, mid -1);}
    }
    
}
