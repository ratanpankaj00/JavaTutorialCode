package LinkedList;

public class MergeSort {
    public static void main(String[] args) {
        Node list1 = new Node(3);
        Node a1 = new Node(3);
        Node b1 = new Node(4);
        Node c1 = new Node(5);
        Node d1= new Node(7);
        Node e1 = new Node(8);
        Node f1 = new Node(8);
        Node list2 = new Node(3);
        Node a2 = new Node(3);
        Node b2 = new Node(4);
        Node c2 = new Node(5);
        Node d2 = new Node(7);
        Node e2 = new Node(8);
        Node f2 = new Node(8);
        list1.next = a1;
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
        f1.next =list2;
        list2.next = a2;
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;
        e2.next = f2;

        mergeSort(list1);
        Node temp = list1;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static Node mergeSort(Node head){
        if(head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head = mergeSort(head);
        head2 = mergeSort(head2);
        return merge(head, head2);
    }

    public static Node merge(Node list1, Node list2) {
        Node i = list1;
        Node j = list2;
        Node rtn = new Node();
        Node k = rtn;
        while(i != null && j != null){
            if(i.data > j.data) {
                k.next = j;
                k = j;
                j = j.next;
            }
            else {
                k.next = i;
                k = i;
                i = i.next;
            }
        }
        if(i==null) k.next = j;
        else k.next = i;
        return rtn.next;
    }
}
