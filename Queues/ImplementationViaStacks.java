package Queues;

import java.util.Stack;

class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    int size;

    public MyQueue() {

    }

    public void push(int x) {
        st.add(x);
        size++;
    }

    public int pop() {
        while (st.size() > 1)
            helper.push(st.pop());
        int rtn = st.pop();
        while (helper.size() > 0)
            st.push(helper.pop());
        size--;
        return rtn;
    }

    public int peek() {
        while (st.size() > 1)
            helper.push(st.pop());
        int rtn = st.peek();
        while (helper.size() > 0)
            st.push(helper.pop());
        return rtn;
    }

    public boolean empty() {
        if (size == 0)
            return true;
        return false;
    }
}

public class ImplementationViaStacks {
    public static void main(String[] args) {
        // LeetCode 232;
        MyQueue obj = new MyQueue();
        obj.push(10); obj.push(20); obj.push(30); obj.push(40); obj.push(50);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
        
    }
}
