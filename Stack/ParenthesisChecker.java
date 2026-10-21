package Stack;
import java.util.Stack;

public class ParenthesisChecker {

    public static boolean parenthesisChecker(String s){
        Stack<Character> st = new Stack<>();
        if(s.length() % 2 != 0) return false;
        else{
            for(int i =0; i<s.length(); i++){
                if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                   st.push(s.charAt(i)); 
                }
                else{
                    if(st.size() == 0) return false;
                    else if(st.peek() == '(' && s.charAt(i) == ')'){
                        st.pop();
                    }
                    else if(st.peek() == '[' && s.charAt(i) == ']'){
                        st.pop();
                    }
                    else if(st.peek() == '{' && s.charAt(i) == '}'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }return st.size() == 0;
    }
    public static void main(String[] args) {
        //Check if parenthesis are balanced or not?
        // (()){[]}  Balanced;
        // ((){) Not balanced;
        String s = "(({}))[]";
        System.out.println(parenthesisChecker(s));

    }
}
