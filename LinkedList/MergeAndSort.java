package LinkedList;

public class MergeAndSort {
    public static void main(String[] args) {
        Node list1 = new Node(3);
        Node a1 = new Node(3);
        Node b1 = new Node(4);
        Node c1 = new Node(5);
        Node d1= new Node(7);
        Node e1 = new Node(8);
        Node f1 = new Node(8);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;
        e1.next = f1;
        Node list2 = new Node(3);
        Node a2 = new Node(3);
        Node b2 = new Node(4);
        Node c2 = new Node(5);
        Node d2 = new Node(7);
        Node e2 = new Node(8);
        Node f2 = new Node(8);
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;
        e2.next = f2;

        mergeTwoLists(list1,list2);
        
    }
    public static Node mergeTwoLists(Node list1, Node list2) {
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
