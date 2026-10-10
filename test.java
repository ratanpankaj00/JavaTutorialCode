public class test{
    public static void main(String[] args) {
        powerSet("", "abc",2);
    }
    private static void powerSet(String ans, String str, int n){
       if(n<0){
        System.out.print(ans + " ");
        return;
       }
        ans += str.charAt(n);
       powerSet(ans, str,n-1);
    }
}

