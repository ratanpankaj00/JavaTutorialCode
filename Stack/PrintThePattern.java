package Stack;
import java.util.Scanner;
import java.util.Stack;
public class PrintThePattern {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int max = 0;

        for(int j = 0; j<=max; j++){
            for(int i = inp.length()-1; i>=0; i--){
            int x = st.push(Integer.parseInt(inp.charAt(i) + ""));
            if(x>max) max = x;
            }
            while(st.size()>0){
                int p = st.pop();
                if(p > j) System.out.print("*"+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
    }
}
