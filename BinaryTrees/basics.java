package BinaryTrees;

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
    }
    Node(){}
}
public class basics {

    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(34);
        Node c = new Node(12);
        Node d = new Node(45);
        Node e = new Node(1);
        Node f = new Node(58);
        Node g = new Node(92);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = f;
        c.right = e;
        c.left = g;
        display(a);
        
    }

    private static void display(Node a) {
        if(a == null) return;
        System.out.print(a.val + " ");
        display(a.left);
        display(a.right);
    }
}
