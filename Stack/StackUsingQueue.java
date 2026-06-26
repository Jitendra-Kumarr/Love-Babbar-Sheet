import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    void push(int x){
        q.add(x); 

        int size = q.size(); 
        for(int i=0; i<size-1; i++){
            q.add(q.remove()); 
        }
    }

    int pop(){
        if(q.isEmpty()){
            return -1;
        }
        return q.remove(); 
    }

    int peek(){
        if(q.isEmpty()){
            return -1; 
        }
        return q.peek(); 
    }

    boolean isEmpty(){
        return q.isEmpty(); 
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());   // 5
        System.out.println(stack.pop());   // 4
        System.out.println(stack.peek());  // 3
    }

}
