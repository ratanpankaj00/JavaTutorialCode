package LinkedList;



class LinkedList{
    Node head;
    Node tail;
    int size;

    //Addint element to last.
    void add(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    
    //Adding element at head.
    void addAtHead(int val){
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
        size++;
    }


// Displaying whole LinkedList
    void display(){
        if (head == null) {
            return;
        }
        Node temp = head;
        System.out.print("[");
        while(temp!=null){
            if(temp == tail) {
                System.out.print(tail.val);
                temp = temp.next;
            }
            else{
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        System.out.println("]");
    }

    // Deleting head element
    void deleteHead(){
        if(head == null) return;      
        Node temp = head;
        head = temp.next;
        temp = null;
        size--;
    }

    // Deleting last element
    void deleteTail(){
        Node temp = head;
        if (head == tail){
            head = tail = null;
            return;
        }
        else if(head == null) return;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;   
        size--;    
    }

    // Inserting element in between two elements
    void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        else if(idx ==0){
            addAtHead(val);
        }          
        else if(idx == size){
            add(val);
        }  
        else{

            int i = 0;
            Node temp = head;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            i = 0;
            Node t = new Node();
            t.next = temp.next;
            temp.next = t;
            size++;
        }   
    }


    // Displaying elements from start to end(excluding end).
    void display(int st, int end){
        Node temp = head;
        for(int i = 0; i<st; i++){
            temp = temp.next;
        }
        for(int j = st; j<end; j++){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // Updating the value of elements.
    void update(int value, int idx){
        Node temp = head;
        for(int i = 0; i<idx; i++){
            temp = temp.next;
        }
        temp.val = value;
    }

    //Searching an value in LinkedList and returning its index.
    int getIndexOf(int value){
        Node temp = head;
        int idx = 0;
        while(temp.next != null){
            if(temp.val == value) return idx+1;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Getting the value of index.
    void deleteAt(int idx){
        if(idx == 0) {
            deleteHead();
            return;
        }
        Node temp0 = head;
        for(int i =0; i<idx-1; i++){
            temp0 = temp0.next;
        }
        Node temp = temp0.next;
        Node temp1 = temp0.next.next;
        temp0.next = temp1;
        temp =null;

    }




}
public class DataStructure {  
     public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.display();
        ll.addAtHead(5);
        ll.display();
        ll.deleteHead();
        ll.display();
        ll.deleteTail();
        ll.display();
        System.out.println(ll.getIndexOf(80));
        ll.display();
        System.out.println(ll.size);
        ll.deleteAt(1);
        ll.display();
    
     }
}
