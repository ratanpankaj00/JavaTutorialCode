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
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(45);
        Node e = new Node(1);
        Node f = new Node(8);
        Node g = new Node(9);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = f;
        c.right = e;
        c.left = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(maxTreeVal(a));
        System.out.println(minTreeVal(a));
        System.out.println(level(a));
    }

    private static void display(Node a) {
        if(a == null) return;
        System.out.print(a.val + " ");
        display(a.left); 
        display(a.right);
    }

    private static int size(Node root){
        if(root == null) return 0 ;
        return size(root.left) + size(root.right) + 1;
    }

    private static int sum(Node root){
        if(root == null) return 0 ;
        return sum(root.left) + sum(root.right) + root.val;
    }

    private static int product(Node root){
        if(root == null) return 1 ;
        return product(root.left)*product(root.right)* root.val;
    }

    private static int maxTreeVal(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(maxTreeVal(root.left),Math.max(maxTreeVal(root.right), root.val));
    }

    private static int minTreeVal(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(minTreeVal(root.left),Math.min(minTreeVal(root.right), root.val));
    }

    private static int level(Node root){
        if(root == null) return 0;
        return Math.max(level(root.left), level(root.right)) + 1;
    }
}
