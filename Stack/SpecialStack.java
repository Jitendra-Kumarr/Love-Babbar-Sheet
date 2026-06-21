class Stack {
    int arr[]; 
    int size; 
    int top; 

    Stack(int size){
        this.size = size; 
        arr = new int[size]; 
        this.top = -1; 
    }

    void push(int x){
        if(top == size-1){
            return ; 
        }
        top = top+1;
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

    boolean isEmpty(){
        return top == -1; 
    }

    int peek(){
        if(isEmpty()){
            return -1; 
        }
        return arr[top]; 
    }
}


public class SpecialStack {
    Stack stack = new Stack(100); 
    Stack minStack = new Stack(100); 

    public void push(int x){
        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public int pop(){
        if(stack.isEmpty()){
            return -1; 
        }
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int top(){
        return stack.peek(); 
    }

    public int getMin(){
        return minStack.peek(); 
    }
}
