package BinarySearch;

public class MaxCountOfPositiveAndNegativeInteger {
    public static void main(String[] args) {
        int []arr = {-5,-4,-2,-1,-1,0,0,2,3,3,4,5,7};
        int low =0, high = arr.length -1, mid = 0;
        int nInd =0, pInd = 0, zInd = 0;
        boolean hasZero = false;
        //Two Cases : 1. Zero is present or not present.
        // Check for zero
        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid] < 0) low = mid+1;
            else if(arr[mid] > 0) high = mid -1;
            else {
                zInd = mid;
                hasZero = true;
                break;
            }
        }
        low =0; high= arr.length-1;
        if(!hasZero){
            while(low<=high){
                mid = (low+high)/2;
                if (arr[mid]>0) {
                    pInd = arr.length -mid;
                    high = mid-1;
                }else if (arr[mid]<0){
                    nInd = mid+1;
                    low = mid+1;
                }
            }
        }

        else if(hasZero){
            int temp = zInd;
            //Finding highest index of zero.
            while(zInd< arr.length-1 && arr[zInd+1] == 0){
                zInd++;
            }
            //Finding minimum index of zero.
            while(temp> 0 && arr[temp-1] == 0){
                temp--;
            }
            nInd = temp;
            pInd = arr.length-1-zInd; 
        }
        if(pInd>nInd) return pInd;
        else return nInd;
    }
}
