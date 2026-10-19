package LinkedList;

public class reverseLinkedList {

    // Node head;
    // Node tail;
    // int size;
    public static void jumpThree(Node temp) {
        if (temp != null && temp.next != null && temp.next.next != null && temp.next.next.next != null) {
            temp = temp.next.next.next;
        }
    }

    public static Node reverseList(Node head){
        Node i = head;
        Node j = head.next;
        Node k = head.next.next;
        while(j != null && i != null && k != null){
            j.next = i;
            jumpThree(i);
            k.next = j;
            jumpThree(j);
            i.next = k;
            jumpThree(k);
        }
        return head;
        
    }

    public static void main(String[] args) {

    }
}
