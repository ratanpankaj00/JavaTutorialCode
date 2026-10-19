package LinkedList;
class Node{
        int data;
        Node next;
        Node(int d){data = d; next = null;}


        public Node() {
            
        }


        // Traditional method to solve this question.
        int getMiddle(Node head){
            int size = 0;
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
                size++;
            }
            int middle = size/2;
            temp = head;
            for(int i = 0; i<middle; i++){
                temp = temp.next;
            }
            return temp.data;

        }

public class MiddleOfLinkedList {

    

        // Slow fast approach or one pass solution.

        int getMid(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;

            }
            return slow.data;
        }
    }
    public static void main(String[] args) {
        // Ques. Given the head of a linked list, the task is to find the middle
        // for ex : 1,2,3,4,5 the middle is 3. 
        // for ex : 1,2,3,4,5,6,7,8 there is a left middle and a right middle. return right middle.


    }
}
