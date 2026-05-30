
class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class MoveLastToFront {

    public static Node moveToFront(Node head){
        if(head == null || head.next == null) return head;

        Node curr = head; 
        Node prev = null; 

        while(curr.next != null){
            prev = curr; 
            curr = curr.next; 
        }

        prev.next = null; 
        curr.next = head; 
        return curr; 
    }


    static Node buildList(int arr[]){
        if(arr.length == 0) return null; 
        Node head = new Node(arr[0]); 
        Node curr = head; 

        for(int i=1; i<arr.length; i++){
            curr.next = new Node(arr[i]); 
            curr = curr.next; 
        }
        return head; 
    }

    public static void main(String[] args) {

        MoveLastToFront obj = new MoveLastToFront();

        int arr[] = {1, 2, 3, 4, 5, 6, 7}; 

        Node head = buildList(arr); 

        head = obj.moveToFront(head); 

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }

    }
}
