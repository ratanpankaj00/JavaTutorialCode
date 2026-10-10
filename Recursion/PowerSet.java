package Recursion;

public class PowerSet {
    public static void main(String[] args) {
        subset("", "abc", 0);
    }
    public static void subset(String ans, String s, int i){
        if(i == s.length()){
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(i);
        subset(ans+ch, s, i+1);//pick
        subset(ans, s, i+1);//skip
    }
}
