
class Node {
    int data; 
    Node next; 

    Node(int data1, Node next){
        this.data = data1; 
        this.next = next; 
    }

    Node(int data){
        this.data = data; 
        this.next = null;
    }
}


public class RemoveLoop {


    public static void removeLoop(Node head){
        if(head == null || head.next == null) return; 

        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if(slow == fast) break; 
        }

        if(fast == null || fast.next == null) return; 

        slow = head; 

        if(slow == fast){
            while (fast.next != slow) {
                fast = fast.next; 
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next; 
                fast = fast.next; 
            }
        }

        fast.next = null; 
    }


    public static void main(String[] args) {
        // Build list: 1 → 2 → 3 → 4 → 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create loop: 5 → 3
        head.next.next.next.next.next = head.next.next;

        System.out.println("Loop node: " + head.next.next.data); // 3

        removeLoop(head);

        Node temp = head; 
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null");
    }


}
