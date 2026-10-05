package BinarySearch;

public class SinglesAmongDoubles {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,6,6,7,7};
        int low = 0, high = arr.length-1;
        int sol = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int mod = mid%2;
            if(mod==0 && arr[mid] == arr[mid+1]){
                sol = mid;
                low = mid+1;
            }else if(mod==1 && arr[mid] == arr[mid+1]){
                high = mid-1;
            }else if(mod==0 && arr[mid] == arr[mid-1]){
                sol = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
    }
}
