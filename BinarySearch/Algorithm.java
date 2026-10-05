package BinarySearch;

public class Algorithm {
    public static void main(String[] args) {
        int [] arr = {49, 510, 615, 9911, 99999};
        int target = 49;
        Boolean found = false;
        int lo =0, hi = arr.length-1;
        while(hi>=lo){
            int mid = (lo+hi)/2;

            if(arr[mid] == target) {
                System.out.println("Found");
                found = true;
                break;
            }
            else if(arr[mid] > target) {
                hi = mid - 1;
            }else {
                lo = mid+1;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
