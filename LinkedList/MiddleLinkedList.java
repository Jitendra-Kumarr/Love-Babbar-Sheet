
class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null;
    }
}


public class MiddleLinkedList {

    public Node middleNode(Node head){
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
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
        
        MiddleLinkedList obj = new MiddleLinkedList();

        int arr[] = {1, 3, 6, 2, 5, 7, 2, 9, 3}; 

        Node head = buildList(arr); 

        head = obj.middleNode(head); 

        System.out.println(head.data);
    }
}
