

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null;
    }
}


public class RemoveDuplicate {

    static Node removeDuplicate(Node head){
        Node temp = head; 

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next; 
            } else {
                temp = temp.next; 
            }
        }
        return head; 
    }


    static Node buildList(int[] arr){
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
        
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5};

        Node head = buildList(arr); 

        head = removeDuplicate(head); 

        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next; 
        }
        System.out.print("null");
    }



}
