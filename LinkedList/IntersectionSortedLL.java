import java.util.HashSet;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class IntersectionSortedLL {

    public static Node findIntersection(Node head1, Node head2){
        HashSet<Integer> set = new HashSet<>(); 

        Node temp = head1; 
        while(temp != null){
            set.add(temp.data); 
            temp = temp.next; 
        }

        Node dummy = new Node(0); 
        Node curr = dummy; 

        Node temp2 = head2; 
        while (temp2 != null) {
            if(set.contains(temp2.data)){
                curr.next = new Node(temp2.data); 
                curr = curr.next; 
            }
            temp2 = temp2.next;
        }
        return dummy.next;
    }

    static Node buildList(int arr[]){
        if(arr.length == 0) return null;
        
        Node head = new Node(arr[0]); 
        Node curr =  head; 
        for(int i=1; i<arr.length; i++){
            curr.next = new Node(arr[i]); 
            curr = curr.next; 
        }
        return head; 
    }
    public static void main(String[] args) {
        
        IntersectionSortedLL obj = new IntersectionSortedLL(); 

        int List1[] = {2, 4, 1}; 
        int List2[] = {2, 4, 1, 6, 3, 9, 3, 6, 9}; 

        Node head1 = buildList(List1); 
        Node head2 = buildList(List2); 


        Node result = obj.findIntersection(head1, head2); 

        Node temp = result; 
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.println("null");

    }
}
