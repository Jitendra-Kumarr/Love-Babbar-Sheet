
class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}



public class CircularLinkedList {


    boolean isCircular(Node head){
        if(head == null) return true; 

        Node temp = head.next; 
        while (temp != null && temp != head) {
            temp = temp.next; 
        }

        return temp == head; 
    }

    static Node buildList(int arr[]){
        if(arr.length == 0) return null; 

        Node head = new Node(arr[0]); 
        Node curr = head; 

        for(int i=1; i<arr.length; i++){
            curr.next = new Node(arr[i]); 
            curr = curr.next; 
        }
        curr.next = head; // make it circular
        return head; 
    }


    

    public static void main(String[] args) {

        CircularLinkedList obj = new CircularLinkedList(); 

        int arr[] = {2, 3, 5, 2, 5, 6, 4, 6, 7, 8, 5}; 
        Node head = buildList(arr);

        boolean result = obj.isCircular(head); 

        System.out.println(result);

    }


}
