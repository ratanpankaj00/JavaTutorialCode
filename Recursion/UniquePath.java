package Recursion;

public class UniquePath {
    //Method 1:
    public static int noOfPaths(int x, int y){
        if(x==1 && y == 1) return 1;
        if(x==0 || y == 0) return 0;
        return noOfPaths(x-1, y) + noOfPaths(x, y-1);
    }

    //Method 2:
    public static int int noOfWays(int x, int y){
        int i = 0, j=0;
        int rows = y, column = x;
         
    }

    public static void main(String[] args) {
        System.out.println(noOfPaths(6, 4));
    }

    
}
