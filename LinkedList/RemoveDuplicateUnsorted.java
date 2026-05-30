import java.util.HashSet;

class Node{
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class RemoveDuplicateUnsorted {


    Node removeDuplicates(Node head){
        Node temp = head; 
        Node prev = null; 

        HashSet<Integer> seen = new HashSet<>();

        while (temp != null) {
            if(seen.contains(temp.data)){
                prev.next = temp.next;
            } else {
                seen.add(temp.data); 
                prev = temp;
            }
            temp = temp.next;
        }
        return head; 
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

        RemoveDuplicateUnsorted obj = new RemoveDuplicateUnsorted();

        int arr[] = {1, 3, 6, 2, 5, 7, 2, 9, 3}; 

        Node head = buildList(arr); 

        head = obj.removeDuplicates(head); 


        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next; 
        }
        System.out.print("null");
    }
}
