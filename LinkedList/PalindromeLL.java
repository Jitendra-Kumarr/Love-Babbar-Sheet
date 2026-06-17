import java.util.Stack;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = next; 
    }
}

public class PalindromeLL {

    public boolean isPalindrome(Node head){
        Stack<Integer> stack = new Stack<>(); 

        Node temp = head; 
        while (temp != null) {
            stack.add(temp.data); 
            temp = temp.next; 
        }

        temp = head; 
        while (!stack.isEmpty()) {
            int top = stack.pop(); 
            if(top != temp.data) return false; 
            temp = temp.next;
        }
        return true; 
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
        int arr[] = {1, 2, 3, 4, 3, 2, 1}; 
        Node head = ArrToLL(arr); 

        PalindromeLL obj = new PalindromeLL();

        boolean result = obj.isPalindrome(head); 
        System.out.println(result);
    }
}
