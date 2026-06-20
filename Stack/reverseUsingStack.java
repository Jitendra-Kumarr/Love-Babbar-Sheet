import java.util.Scanner;

class Stack {
    int arr[]; 
    int size; 
    int top; 

    Stack(int size){
        this.size = size; 
        arr = new int[size]; 
        this.top = -1; 
    }

    boolean isFull(){
        return top == size-1; 
    }

    boolean isEmpty(){
        return top == -1; 
    }

    void push(int x){
        if(isFull()){
            return;
        }
        top = top + 1; 
        arr[top] = x; 
    }

    int pop(){
        if(isEmpty()){
            return -1; 
        }
        int val = arr[top]; 
        top = top-1; 
        return val; 
    }


}


public class reverseUsingStack {
    

    public String reverse(String s){
        Stack stack = new Stack(s.length()); 

        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }

        String reversed = ""; 

        while (!stack.isEmpty()) {
            char top = (char) stack.pop(); 
            reversed += top; 
        }
        return reversed; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();

        reverseUsingStack obj = new reverseUsingStack(); 
        String reversed = obj.reverse(str); 

        System.out.println(reversed);


        sc.close();
    }
}
