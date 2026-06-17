// package Stack;

//  ------------------------------- STACK USING ARRAY -------------------------------------- // 
public class Stack {

    private int arr[]; 
    private int top;
    private int size;
    
    Stack(int size){
        this.size = size; 
        arr = new int[size]; 
        top = -1; 
    }

    void push(int element){
        if(top == size-1){
            System.out.println("Stack Overflow! ");
            return; 
        }
        top = top+1; 
        arr[top] = element;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow! ");
            return -1; 
        }
        int val = arr[top]; 
        top = top-1; 
        return val; 
    }


    boolean isEmpty(){
        return top == -1; 
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is Empty! ");
            return -1; 
        }
        return arr[top]; 
    }

    
    public static void main(String[] args) {
        Stack stack = new Stack(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());  // 30
        System.out.println("Pop: "  + stack.pop());   // 30
    }
}
