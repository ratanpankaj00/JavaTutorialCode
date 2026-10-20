package Stack;
import java.util.Stack;
public class ReverseStackRecursively {
    public static void main(String[] args) {
        Stack <Integer> nums = new Stack<>();
        nums.add(12);
        nums.add(23);
        nums.add(-1);
        nums.add(0);
        nums.add(29);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        reverse(nums);
        System.out.println(nums);
    }
    public static void reverse(Stack<Integer> st){
        if (st.size() == 0) {
            return; 
        }
        int temp = st.pop();
        reverse(st);
        pushAtBottom(st, temp);
    }
    private static void pushAtBottom(Stack<Integer> st , int temp) {
        Stack <Integer> temp2 = new Stack<>();
        while(st.size()>0){
            temp2.add(st.pop());
        }
        st.push(temp);
        while(temp2.size()>0){
            st.add(temp2.pop());
        }

    }
}
