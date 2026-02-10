class Node{
    int data;
    Node next;
    
    // Constructor to initialize the node
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Main{

    // function to delete a  node at the beginning of the linked list
    public static Node deletionAtfirst(Node head){
        if(head == null){
            return null;
        }
       Node temp = head;
       head = head.next;
       temp.next = null;
       return head;
    }

    // function to print the linked list
    public static void printList(Node head){
        Node current  = head;
        while(current != null){
            System.out.print(current.data + "->" );
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){

        // Create a sample linked list: 10->20->30->null
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(60);

       //deletion node   at the beginning
        head = deletionAtfirst(head);
        printList(head);


    }
}

