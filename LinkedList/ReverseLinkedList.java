// package LinkedList;

class Node{
    int data; 
    Node next; 

    Node(int data1, Node next) {  
        this.data = data1;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {


    Node reverseList(Node head){
        Node curr = head; 
        Node prev = null; 

        while (curr != null) {
            Node next = curr.next; 
            curr.next = prev;
            prev = curr; 
            curr = next; 
        }
        return prev; 
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);



        ReverseLinkedList obj = new ReverseLinkedList();
        head = obj.reverseList(head);


        Node temp = head; 
        
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next; 
        }
    }
    
    
}