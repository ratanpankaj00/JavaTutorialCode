public class TwoSumProb {
    public static void main(String[] args) {
        int [] arr = {1,2,-1,0,3,5,-3,6,8};
        int sum;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == 5){
                    System.out.print("(" + arr[i]+ ", " +arr[j] +") ");
                }
            } 
        }
    }
}
