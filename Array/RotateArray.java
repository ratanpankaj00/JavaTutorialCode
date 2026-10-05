public class RotateArray {
    //!Important
    //!Important
    //!Important
    public static void main(String[] args) {
        int [] arr = { 6,8,1,2,4,9,0};
        int d = 24 , n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
        /*int i = 0;
        int j = d-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

        i = d; j= n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }

        i = 0; j= n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        } */

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static void reverseArray(int[] arr,int s, int e){
        int i = s, j= e;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
