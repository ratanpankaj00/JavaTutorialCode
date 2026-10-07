package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-3, -1, 0, 2, 4, 5, 7, 11, 20, 21, 24, 29, 30, 40, 100};
        System.out.println(search(arr, 7,0, arr.length-1));
    }
    public static int search(int[] arr, int tar, int i, int j){
        int mid = (i+j)/2;
        if(i>j) return -1;
        if(arr[mid] == tar) return mid;
        if(arr[mid] > tar) return search(arr, tar, i, mid-1);
        if(arr[mid] < tar) return search(arr, tar, mid+1, j);
        return -1;

    }
}
