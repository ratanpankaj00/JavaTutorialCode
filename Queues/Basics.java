package Queues;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        // Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        System.out.println(q);
        q.remove();
        System.out.println(q + " " +q.size());
        print(q);
        addAtIndex(q, 2, 25);
        print(q);
    }
    public static void print(Queue q){
        int i = q.size();
        for(i = i; i>0; i--){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    private static void addAtIndex(Queue q, int idx, int val){
        if(idx <0 || idx>q.size()) {
            System.out.println("Invalid Index!");
            return;
        }
        int n = q.size();
        if(idx < n){
            for(int i = 1; i <= idx; i++){
                q.add(q.remove());
            }
        }
        q.add(val);
        for(int i = 1; i<=n-idx; i++){
            q.add(q.remove());
        }

    }
}
