package Recursion;

public class UniquePath {
    public static int noOfPaths(int x, int y){
        if(x==1 && y == 1) return 1;
        if(x==0 || y == 0) return 0;
        return noOfPaths(x-1, y) + noOfPaths(x, y-1);
    }
    public static void main(String[] args) {
        System.out.println(noOfPaths(6, 4));
    }
}
