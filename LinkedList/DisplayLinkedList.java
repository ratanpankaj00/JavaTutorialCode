package LinkedList;

import java.util.Scanner;

public class DisplayLinkedList{
    public static void displayRecursively(Node head){
        /*Node temp = head;
        if(temp == null) return;
        System.out.print(temp.val + " ");
        displayRecursively(temp.next);*/

        if(head == null) return;
        System.out.print(head.val +" ");
        displayRecursively(head.next);
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next; // Very Important
        }

    }

    public static void printIdx(Node head, int idx ){
        Node temp = head;
        for(int i = 0; i<idx; i++){
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    public static void main(String[] args) {
        System.out.println(); 
        try (Scanner scan = new Scanner(System.in)) {
            Node a = new Node(scan.nextInt()); 
            Node b = new Node(20); 
            Node c = new Node(30); 
            Node d = new Node(40); 
            Node e = new Node(50); 
            a.next = b;
            b.next = c;
            c.next = d;
            e.next = e;
            //displayRecursively(a);
            printIdx(a, 2);
        }
    }
}