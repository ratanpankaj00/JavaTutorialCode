package Queues;

class Node{
    int val;
    Node next;
    Node(){};
    Node(int val){
        this.val = val;
    }
}
class queue{
    Node front;
    Node rear;
    int size;
    void add(int val){
        Node temp = new Node(val);
        if(rear == null) front = rear = temp;
        else{
            rear.next = temp; 
            rear = temp;
        }
        size++;
    }

    int remove() throws Exception{
        if(size == 0) {
            throw new Exception("Queue is empty");
        }
        Node temp = front.next;
        int val = front.val;
        front  = null;
        front  = temp;
        size--;
        return val;
        
    }
    int size(){
        return size;
    }

    int peek() throws Exception{
        if(size == 0) {
            throw new Exception("Queue is empty");
        }
        return front.val;
    }

    void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
public class ImplementationViaLinkedList {
    public static void main(String[] args) throws Exception { 
        queue q = new queue();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        q.add(60);
        q.display();
    }
}
