package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);q.add(50);
        System.out.println(q);
        System.out.println(reversQueue(q));

    }
    private static Queue reversQueue(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        return q;
    }
}
