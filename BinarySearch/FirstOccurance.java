package BinarySearch;

public class FirstOccurance {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,4,5,5,5,6,7,8,11};
        int low = 0, high = arr.length-1;
        int tar = 5;
        int fo = 0;
        while(high>=low){
            int mid = (low+high)/2;
            fo = mid;
            if(arr[mid] > tar){
                high = mid -1;
            } else if(arr[mid] < tar){
                low = mid +1;
            }else{
                fo = mid;
                high = mid -1;
            }
            
        }
        System.out.println(fo);
    }
}
