package BinarySearch;
// left
public class FloorInTheSortedArray {
    public static void main(String[] args) {
        /*Given a sorted array arr[] and an integer x, find the index (0-based) of the largest 
         element in arr[] that is less than or equal to x. 
         This element is called the floor of x. If such an element does not exist, return -1.*/
        
        int [] arr ={1,2,8,10,10,12,19};
        int x = 5;
        int low=0, high=arr.length-1;
        int mid = 0;
        int floor = 0;
        while(low<=high){
           mid = (low + high)/2;
            if(arr[mid]<x){
                floor = arr[mid];
                low = mid+1;
            }
            else if(arr[mid] > x){
                high = mid -1;
            }else return;
        }System.out.println(floor);
    }
}
