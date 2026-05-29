
class Node {
    int data; 
    Node next; 

    Node(int data, Node next){
        this.data = data; 
        this.next = next; 
    }

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}


public class DetectLoop {

    public boolean detectLoop(Node head){
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if(slow == fast){
                return true; 
            }
        }
        return false; 
    }


    public static void main(String[] args) {
        Node head = new Node(1); 
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        DetectLoop obj = new DetectLoop(); 
        boolean hasLoop = obj.detectLoop(head); 


        if(hasLoop){
            System.out.println("Loop Detected!");
        } else {
            System.out.println("No Loop Found!");
        }



    }
}
