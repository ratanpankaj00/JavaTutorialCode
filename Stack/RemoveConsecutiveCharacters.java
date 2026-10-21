package Stack;

import java.util.Stack;

public class RemoveConsecutiveCharacters {
    static String removeConsecutiveCharacters(String s){
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i< s.length(); i++){
            if(st.peek() != s.charAt(i)){
                st.push(s.charAt(i));
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s1 = "aaaaabbbbccccddde"; // Ans = abcde
        String s2 = "aaaaabbbbee"; // Ans = abe
        System.out.println(removeConsecutiveCharacters(s2));
    }
}
