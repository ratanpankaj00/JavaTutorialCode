package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        long num = 100;
        long x = num / 2;
        long sol =0;
        long low = 0, high = x;
        if(num ==1) System.out.println(1);
        else{

            while (low <= high) {
                long mid = (low+high)/2;
                if(mid*mid<num){
                    sol =mid;
                    low = mid+1;
                }
                else if(mid*mid>num){
                    high = mid-1;
                }
            }System.out.println(sol);
        }
    }
}
