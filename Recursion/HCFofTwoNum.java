package Recursion;

public class HCFofTwoNum {
    public static int HCFofTwoNum(int n1, int n2){
        int y = Math.max(n1, n2) % Math.min(n2, n1);
        if(y == 0) return Math.min(n2, n1);
        else return HCFofTwoNum(Math.min(n2, n1), y);
    }
    public static void main(String[] args) {
        int n1 =100, n2 = 125;
        int x=0,y=0;

        System.out.println(HCFofTwoNum(12, 16));

        // Iterative Method
        for(int i = n1; i <= Math.min(n1, n2); i--){
            if(n1%i ==0 && n2%i ==0){ 
                x=i;
                break;
            }            
        } System.out.println(x);
    }
}
