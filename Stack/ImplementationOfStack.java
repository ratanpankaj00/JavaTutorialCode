package Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val  = val;
    }
    Node(){

    }
}

class MyStack{
    Node head;
    int length = 0;
    int peek() throws Exception{
        if(length == 0){
            throw new Exception("Stack underflow error");
        }
        return head.val;
    }
    int pop() throws Exception{//delete at head
        if(length == 0){
            throw new Exception("Stack underflow error");
        }
        int x = head.val;
        head = head.next;
        length--;
        return x;
    }
    void push(int val){//add at head
        Node temp = new Node(val);
        if(length == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        length++;
    }
    int size(){
        return length;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class ImplementationOfStack {
    public static void main(String[] args) throws Exception {
        // peek, pop, push, size
        MyStack st = new MyStack();
        st.peek();
        st.push(12);
        st.push(1);
        st.push(2);
        st.push(11);
        st.push(14);
        st.push(19);
        st.display();
        st.pop();
        st.pop();
        st.display();
    }
}
