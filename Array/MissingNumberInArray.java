import java.util.Arrays;
public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6, 7, 8,9,10};
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 1; i<n; i++){
            if(arr[i] - arr[i-1] == 2){
                System.out.println(arr[i-1]+1);
                break;
            }
        }
    }
}
