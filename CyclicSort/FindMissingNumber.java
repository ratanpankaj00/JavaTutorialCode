package CyclicSort;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(finder(arr));
    }
    private static int finder(int [] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] == i+1 || arr[i] == arr.length+1) i++;
            else {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j] != j+1) return j+1;
        }
        return arr.length+1;
    }
}
