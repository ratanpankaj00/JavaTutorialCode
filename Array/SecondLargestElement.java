public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {2, 7, 12, 10, 63, -1, 0};
        byte n = 2;
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        } 
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(secMax<arr[i] && arr[i]!=max){
                secMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);

    }
}
