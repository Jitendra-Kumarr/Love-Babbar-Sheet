public class CheckIfCircular {

    public boolean ifCircular(Node head){
        if(head == null) return false; 

        Node temp = head.next; 
        while (temp != null && temp != head) {
            temp = temp.next; 
        }

        return temp == head; 
    }


    public static Node ArrToLL(int arr[]){
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
        int arr[] = {2, 4, 6, 7, 5, 2}; 

        Node head = ArrToLL(arr); 

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = head;   

        CheckIfCircular obj = new CheckIfCircular(); 
        boolean result = obj.ifCircular(head); 

        System.out.println(result);

    }
}
