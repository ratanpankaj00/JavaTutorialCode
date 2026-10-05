public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {6, 8, 1, 2, 4, 9};
        for(int i=0; i<(arr.length/2); i++){
            int x = arr[i];
            int y = arr[arr.length - i-1];
            arr[arr.length -i-1]= x;
            arr[i] = y;
        }

        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
