package TimeAndSpaceComplexity;

public class DetectDuplicate {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 6, 4, 3, 4, 9, 5, 2, 7 };
        for(int j = arr.length-1; j>=0; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] == arr[j] && i!=j) {
                    System.out.println("Duplicate element found as '" + arr[i] + "' at indices (" + i + ", " + j + ").");
                }
            }
        }

        int n = arr.length -1;
        long sum = n*(n+1)/2;
        long arrSum = 0;
        for(int i = 0; i<=n ; i++){
            arrSum += arr[i];
        }
        System.out.println("Duplicate element is " + (arrSum - sum));
    }
}
