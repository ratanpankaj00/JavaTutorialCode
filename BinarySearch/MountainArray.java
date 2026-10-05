package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, 5, 6,8, 8, 6, 3 };
        int low = 0, high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid<(arr.length - 1) && arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            } else if (mid>0 && arr[mid] <= arr[mid - 1]) {
                high = mid - 1;
            }else{break;}
        }
        System.out.println(arr[mid]);
    }
}
