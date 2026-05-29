
class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null;
    }
}


public class firstNodeofLoop {
    public int cycleStart(Node head){
        Node slow = head; 
        Node fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 

            if(slow == fast){
                slow = head; 
                while(slow != fast){
                    slow = slow.next; 
                    fast = fast.next; 
                }
                return slow.data;
            }
        }
        return -1;
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

        firstNodeofLoop obj = new firstNodeofLoop();
        int result = obj.cycleStart(head);


        if (result != -1) {
            System.out.println("First node of loop: " + result);
        } else {
            System.out.println("No loop found.");
        }
    }



}
