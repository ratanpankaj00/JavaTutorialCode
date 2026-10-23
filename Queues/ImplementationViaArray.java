package Queues;

class MyQueue {
    private int[] arr;
    private int f;
    private int r;
    private int size;

    MyQueue(int cap) {
        arr = new int[cap];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue is FULL!");
            return;
        }
        arr[r++] = val;
        if (r == arr.length)
            r = 0;
        size++;
    }

    void remove() {
        if (size == 0) {
            System.out.println("Queue is EMPTY!");
            return;
        }
        f++;
        if (f == arr.length)
            f = 0;
        size--;
    }

    int peek() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is Empty!!");
        }
        return arr[f];
    }

    void display() {
        if (size == 0)
            return;
        else if (f < r) {
            for (int i = f; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = f; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}

public class ImplementationViaArray {
    public static void main(String[] args) throws Exception {
        MyQueue q = new MyQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.remove();
        q.add(70);
        q.display();
        q.remove();
        System.out.println(q.peek());
        q.display();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // q.remove();
        // q.remove();
        // q.add(60);
        // q.add(70);
        // q.display();

    }
}
