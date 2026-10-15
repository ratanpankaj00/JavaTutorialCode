package Stack;
import java.util.Stack;
import java.util.ArrayList;

public class BasicSTLOfStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        // System.out.println(st.isEmpty());
        // System.out.println(st.size() == 0);
        st.push("Raghav");
        st.push("Ratan");
        st.push("Pankaj");
        st.push("Vansh");
        st.push("Pravas");

        // System.out.println(st.size());
        // System.out.println(st.pop());
        // System.out.println(st);
        // display(st);
        // System.out.println(st);
        // System.out.println();
        // reverseStack(st);
        pushAtBottomRec(st, "HELLO");
        System.out.println(st);

        
        // stack.pop - removes the last element added and return the element.
        
        
    }
    // Displaying the elemets of stack without changing the original stack

    public static void display(Stack<String> s){
        Stack<String> s2 = new Stack<>();
        while(s.size()>0){
            String top = s.pop();
            System.out.print(top+ " ");
            s2.push(top);
        }
        while(s2.size()>0){
            s.push(s2.pop());
        }
    }

    public static void reverseStack(Stack<String> s){
        String [] arr = new String[s.size()];
        for(int i = 0; s.size()>0; i++){
            arr[i] = s.pop();
        }

        for(int i = 0; i<arr.length; i++){
            s.push(arr[i]); 
        }
    }

    public static void pushAtBottomRec(Stack<String> st, String s){
        if(st.size() == 0) {
            st.push(s);
            return;
        }
        String temp = st.pop();
        pushAtBottomRec(st, s);
        st.push(temp);

        //**** Solution ****


    }
}
